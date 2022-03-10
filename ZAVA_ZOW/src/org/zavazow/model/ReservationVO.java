package org.zavazow.model;

public class ReservationVO {

	private int reservationNum;
	private String busStopId;
	private String lineId;
	private String busId;
	private long reservationYN;
	
	public ReservationVO(int reservationNum, String busStopId, String lineId, String busId, long reservationYN) {
		this.reservationNum = reservationNum;
		this.busStopId = busStopId;
		this.lineId = lineId;
		this.busId = busId;
		this.reservationYN = reservationYN;
	}

	public ReservationVO(String busStopId, String lineId, String busId, long reservationYN) {
		super();
		this.busStopId = busStopId;
		this.lineId = lineId;
		this.busId = busId;
		this.reservationYN = reservationYN;
	}

	public int getReservationNum() {
		return reservationNum;
	}

	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}

	public String getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(String busStopId) {
		this.busStopId = busStopId;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public long getReservationYN() {
		return reservationYN;
	}

	public void setReservationYN(long reservationYN) {
		this.reservationYN = reservationYN;
	}
	
	
	
}
