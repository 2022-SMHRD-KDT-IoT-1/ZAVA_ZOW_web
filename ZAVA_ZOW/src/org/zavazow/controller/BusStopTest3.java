package org.zavazow.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.zavazow.model.BusStopDAO;
import org.zavazow.model.BusStopVO;

public class BusStopTest3 {
    public static void main(String[] args) {
	

    	// 파싱한 데이터를 저장할 변수
    	String result = "";
    	String busStopName = "";
		String nextBusStop = "";
		int busStopId = 0;
		
		
		BusStopDAO dao = new BusStopDAO();
		BusStopVO vo = null;
		int cnt = 0;

    	try {

    		URL url = new URL("http://api.gwangju.go.kr/json/stationInfo");

    		BufferedReader bf;

    		bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

    		result = bf.readLine();
//        	System.out.println(result);

        	JSONParser jsonParser = new JSONParser();
        	JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
        	JSONArray stationList = (JSONArray)jsonObject.get("STATION_LIST");
        	
        	
        	for (int i = 0; i < stationList.size(); i++) {
        	
        		
        		JSONObject temp = (JSONObject)stationList.get(i);
        		
        		busStopName = (String)temp.get("BUSSTOP_NAME");
        		nextBusStop = (String)temp.get("NEXT_BUSSTOP");
        		if (nextBusStop == null) {
					nextBusStop = "null";
				}
        		long busStopIdL = (long)temp.get("BUSSTOP_ID");
        		busStopId = (int)busStopIdL;
        		
        		vo = new BusStopVO(busStopName, nextBusStop, busStopId);
        		cnt = dao.insertData(vo);
        		
        	}
        	
        	if (cnt > 0) {
				System.out.println("데이터 삽입 성공!");
			}
        	
//        		System.out.println(busStopName);
//        		System.out.println(busStopId);
//        		System.out.println(nextBusStop);

    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
//    	List<BusStopVO> list = dao.selectBoard("동원촌");
//    	for (int i = 0; i < list.size(); i++) {
//			
//    		System.out.println(list.get(i).getBusStopName());
//    		System.out.println(list.get(i).getBusStopId());
//    		
//		}
    	
    }
}