package org.zavazow.model;

public class LineStationVO {

	private String busStopName;
	private long busStopNum;
	private long busStopId;
	private long lineId;
	private String lineName;
	
	public LineStationVO(String busStopName, long busStopNum, long busStopId, long lineId, String lineName) {
		this.busStopName = busStopName;
		this.busStopNum = busStopNum;
		this.busStopId = busStopId;
		this.lineId = lineId;
		this.lineName = lineName;
	}

	public String getBusStopName() {
		return busStopName;
	}

	public void setBusStopName(String busStopName) {
		this.busStopName = busStopName;
	}

	public long getBusStopNum() {
		return busStopNum;
	}

	public void setBusStopNum(long busStopNum) {
		this.busStopNum = busStopNum;
	}

	public long getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(long busStopId) {
		this.busStopId = busStopId;
	}

	public long getLineId() {
		return lineId;
	}

	public void setLineId(long lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	
	
}
