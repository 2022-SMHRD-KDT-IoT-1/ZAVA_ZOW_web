package org.zavazow.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.zavazow.model.BusLocationVO;
import org.zavazow.model.LineStationVO;
import org.zavazow.model.ReservationDAO;
import org.zavazow.model.ReservationVO;

import com.google.gson.Gson;


@WebServlet("/api/test")
public class BusDriverApiService extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setStatus(200);
		response.setCharacterEncoding("utf-8");
		
		ReservationDAO dao = new ReservationDAO();
		List<ReservationVO> list = dao.selectReservation();
		
		String result = "{\"RESERVATION_LIST\":";
		
		Gson gson = new Gson();
		String str1 = gson.toJson(list);
		result += str1 + ", ";
		
		String resultL = "";
		String resultS = "";
		
		
		// 파싱한 데이터를 저장할 변수
//    	String lineId = request.getParameter("lineId");
//    	String busId = request.getParameter("busId");
    	String lineId = "8";
    	String busId = "773363";
    	BusLocationVO lvo = null;
    	List<LineStationVO> slist = new ArrayList<LineStationVO>();
    	

    	try {

    		URL busLocationURL = new URL("http://api.gwangju.go.kr/json/busLocationInfo?LINE_ID=" + lineId);
    		URL lineStationInfoURL = new URL("http://api.gwangju.go.kr/json/lineStationInfo?LINE_ID=" + lineId);

    		BufferedReader lbf;
    		BufferedReader sbf;

    		lbf = new BufferedReader(new InputStreamReader(busLocationURL.openStream(), "UTF-8"));
    		sbf = new BufferedReader(new InputStreamReader(lineStationInfoURL.openStream(), "UTF-8"));

    		resultL = lbf.readLine();
    		resultS = sbf.readLine();
    		
//    		System.out.println(resultL);
    		

        	JSONParser jsonParser = new JSONParser();
        	JSONObject jsonObjectL = (JSONObject)jsonParser.parse(resultL);
        	JSONArray busLocationList = (JSONArray)jsonObjectL.get("BUSLOCATION_LIST");
        	
        	for (int i = 0; i < busLocationList.size(); i++) {
        		
        		JSONObject temp = (JSONObject)busLocationList.get(i);
        		
        		long currStopId = (long)temp.get("CURR_STOP_ID");
        		String busIdL = (String)temp.get("BUS_ID");
        		long num = (long)temp.get("NUM");
        		long lineIdL = (long)temp.get("LINE_ID");
        		
        		if (busIdL.equals(busId)) {
        			lvo = new BusLocationVO(currStopId, busIdL, num, lineIdL);
					break;
				}
				
			}
        	
//        	System.out.println(lvo.getCurrStopId());
//        	System.out.println(lvo.getBusId());
        	String str2 = gson.toJson(lvo);
//        	System.out.println(str2);
        	
        	result += "\"BUSLOCATION_LIST\":" + str2 + ", ";
//        	System.out.println(result);
        	
        	
        	JSONObject jsonObjectS = (JSONObject)jsonParser.parse(resultS);
        	JSONArray lineStationiList = (JSONArray)jsonObjectS.get("BUSSTOP_LIST");
        	
        	for (int i = 0; i < lineStationiList.size(); i++) {
        		
        		JSONObject temp = (JSONObject)lineStationiList.get(i);
        		
        		String busStopName = (String)temp.get("BUSSTOP_NAME");
        		long busStopNum = (long)temp.get("BUSSTOP_NUM");
        		long busStopId = (long)temp.get("BUSSTOP_ID");
        		long lineIdS = (long)temp.get("LINE_ID");
        		String lineName = (String)temp.get("LINE_NAME");
        		
        		LineStationVO svo = new LineStationVO(busStopName, busStopNum, busStopId, lineIdS, lineName);
        		slist.add(svo);
//        		if (lvo.getCurrStopId() == busStopId) {
//				}
        		
        		
			}
        	String str3 = gson.toJson(slist);
        	result += "\"BUSSTOP_LIST\":" + str3 + "}";
//        	System.out.println(result);

    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		
		ServletOutputStream outputStream =  response.getOutputStream();
//		String str1 = "{\"busStop\": [ { \"stop1\": true}, {\"stop2\": "+ (Math.random() < 0.5 ? "true" : "false") +  "  } ] }";		
//		outputStream.write(str.getBytes("utf-8"));
		outputStream.write(result.getBytes("utf-8"));
		
		
	}

}
