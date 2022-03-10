package org.zavazow.model;

public class BusStopVO {
	
	private long stationNum;
	private String busStopName;
	private String nextBusStop;
	private long busStopId;
	
	public BusStopVO(long stationNum, String busStopName, String nextBusStop, long busStopId) {
		this.stationNum = stationNum;
		this.busStopName = busStopName;
		this.nextBusStop = nextBusStop;
		this.busStopId = busStopId;
	}
	

	public BusStopVO(String busStopName, String nextBusStop, long busStopId) {
		this.busStopName = busStopName;
		this.nextBusStop = nextBusStop;
		this.busStopId = busStopId;
	}


	public long getStationNum() {
		return stationNum;
	}

	public void setStationNum(int stationNum) {
		this.stationNum = stationNum;
	}

	public String getBusStopName() {
		return busStopName;
	}

	public void setBusStopName(String busStopName) {
		this.busStopName = busStopName;
	}

	public String getNextBusStop() {
		return nextBusStop;
	}

	public void setNextBusStop(String nextBusStop) {
		this.nextBusStop = nextBusStop;
	}

	public long getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(long busStopId) {
		this.busStopId = busStopId;
	}
	
	
}
