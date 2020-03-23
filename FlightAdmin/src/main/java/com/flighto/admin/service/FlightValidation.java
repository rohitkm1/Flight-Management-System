package com.flighto.admin.service;

public interface FlightValidation { 
	
	String flightModel="[a-z-A-Z]*";
	String flightNumber ="[1-9][0-9][0-9][0-9]";
	//String seatCapacity="[0-9][0-9]";
	String carrierName="[a-z-A-Z]*";
	//String e="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}";
	
	public static boolean validateData(String data, String flightModel)
	{
		return data.matches(flightModel);
	}
	public static boolean validateData1(String data, String flightNumber)
	{
		return data.matches(flightNumber);
	}
	public static boolean validateData2(String data, String seatCapacity)
	{
		return data.matches(seatCapacity);
	}
	public static boolean validateData3(String data, String carrierName)
	{
		return data.matches(carrierName);
	}


}
