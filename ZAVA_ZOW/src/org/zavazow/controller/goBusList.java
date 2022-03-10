package org.zavazow.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.zavazow.model.BusListVO;

@WebServlet("/goBusList")
public class goBusList extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String busStopId = request.getParameter("busStopId");
		
		// 파싱한 데이터를 저장할 변수
    	String result = "";
    	BusListVO vo = null;
    	List<BusListVO> list = new ArrayList<BusListVO>();

    	try {

    		URL url = new URL("http://api.gwangju.go.kr/json/arriveInfo?BUSSTOP_ID=" + busStopId);

    		BufferedReader bf;

    		bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

    		result = bf.readLine();

        	JSONParser jsonParser = new JSONParser();
        	JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
        	JSONArray busStopList = (JSONArray)jsonObject.get("BUSSTOP_LIST");
        	
        	
        	for (int i = 0; i < busStopList.size(); i++) {
        		
        		JSONObject temp = (JSONObject)busStopList.get(i);
        		
        		String lineName = (String)temp.get("LINE_NAME");
        		String lowBus = (String)temp.get("LOW_BUS");
        		long remainMin = (long)temp.get("REMAIN_MIN");
        		long arriveFlag = (long)temp.get("ARRIVE_FLAG");
        		String busStopName = (String)temp.get("BUSSTOP_NAME");
        		long remainStop = (long)temp.get("REMAIN_STOP");
        		
        		String busId = (String)temp.get("BUS_ID");
        		long lineId = (long)temp.get("LINE_ID");
        		
        		vo = new BusListVO(lineName, lowBus, remainMin, arriveFlag, busStopName, remainStop, busId, lineId);
        		
        		list.add(vo);
        		
//        		System.out.println(lineName);
//        		System.out.println(busStopName);
//        		System.out.println(remainMin);
//        		System.out.println(remainStop);
        		
			}
        	

    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		
    	response.setCharacterEncoding("utf-8");
    	request.setAttribute("busListInfo", list);    	
    	
    	RequestDispatcher rd = request.getRequestDispatcher("busList.jsp");
		rd.forward(request, response);
    	
	}

}
