package com.flighto.admin.service;

import java.util.ArrayList;

import com.flighto.admin.bean.Airport;

public interface AirportService {
	
	public void addAirport();
	public ArrayList<Airport> viewAirport();
	public Airport viewAirport(String airportCode);

}
