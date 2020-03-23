package com.flighto.admin.service;

public interface AirportValidation {
	
	String airportName="[a-z-A-Z]*";
	String airportLocation="[a-z-A-Z]*";
	
	public static boolean validateData4(String data, String airportName)
	{
		return data.matches(airportName);
	}
	public static boolean validateData5(String data, String airportLocation)
	{
		return data.matches(airportLocation);
	}

}
