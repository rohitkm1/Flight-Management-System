package com.flighto.admin.bean;

public class Flight {
	
	private String flightModel;
	private long flightNumber;
	private int seatCapacity;
	private String carrierName;
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public Flight(String flightModel, long flightNumber, int seatCapacity, String carrierName) {
		super();
		this.flightModel = flightModel;
		this.flightNumber = flightNumber;
		this.seatCapacity = seatCapacity;
		this.carrierName = carrierName;
	}
	public Flight() {
		
	}
	

}
