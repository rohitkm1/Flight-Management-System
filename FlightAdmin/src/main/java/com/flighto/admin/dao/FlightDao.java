package com.flighto.admin.dao;

import java.util.ArrayList;

import com.flighto.admin.bean.Flight;

public interface FlightDao {
	
	public Flight addFlight();
	public ArrayList viewFlight();
	public void deleteFlight(long FlightNumber);
}
