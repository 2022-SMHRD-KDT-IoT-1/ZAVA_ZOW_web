package org.zavazow.model;

public class BusListVO {

	private String lineName;
	private String lowBus;
	private long remainMin;
	private long arriveFlag;
	private String busStopName;
	private long remainStop;
	
	private String busId;
	private long lineId;
	
	public BusListVO(String lineName, String lowBus, long remainMin, long arriveFlag, String busStopName,
			long remainStop, String busId, long lineId) {
		this.lineName = lineName;
		this.lowBus = lowBus;
		this.remainMin = remainMin;
		this.arriveFlag = arriveFlag;
		this.busStopName = busStopName;
		this.remainStop = remainStop;
		this.busId = busId;
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLowBus() {
		return lowBus;
	}

	public void setLowBus(String lowBus) {
		this.lowBus = lowBus;
	}

	public long getRemainMin() {
		return remainMin;
	}

	public void setRemainMin(long remainMin) {
		this.remainMin = remainMin;
	}

	public long getArriveFlag() {
		return arriveFlag;
	}

	public void setArriveFlag(long arriveFlag) {
		this.arriveFlag = arriveFlag;
	}

	public String getBusStopName() {
		return busStopName;
	}

	public void setBusStopName(String busStopName) {
		this.busStopName = busStopName;
	}

	public long getRemainStop() {
		return remainStop;
	}

	public void setRemainStop(long remainStop) {
		this.remainStop = remainStop;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public long getLineId() {
		return lineId;
	}

	public void setLineId(long lineId) {
		this.lineId = lineId;
	}
	
	
}
