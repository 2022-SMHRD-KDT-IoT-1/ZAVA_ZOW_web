package org.zavazow.model;

public class BusLocationVO {

	private long currStopId;
	private String busId;
	private long num;
	private long lineId;
	
	public BusLocationVO(long currStopId, String busId, long num, long lineId) {
		this.currStopId = currStopId;
		this.busId = busId;
		this.num = num;
		this.lineId = lineId;
	}

	public long getCurrStopId() {
		return currStopId;
	}

	public void setCurrStopId(long currStopId) {
		this.currStopId = currStopId;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public long getLineId() {
		return lineId;
	}

	public void setLineId(long lineId) {
		this.lineId = lineId;
	}
	
	
}
