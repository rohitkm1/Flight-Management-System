package com.flighto.admin.service;

import java.util.ArrayList;

import com.flighto.admin.bean.Flight;

public interface FlightService {
	
	public Flight addFlight() throws XceptionJava;
	public Flight modifyFlight();
	public Flight viewFlight(long FlightNumber);
	public ArrayList<Flight> viewFlight();
	public void deleteFlight(long FlightNumber);





}
