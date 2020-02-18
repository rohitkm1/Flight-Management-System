package com.flighto.admin.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.util.AirportCollection;

public class AirportServiceImpl implements AirportService{
	
	Airport a =new Airport();
	AirportCollection aColl=new AirportCollection();
	
	@Override
	public void addAirport()
	{
		System.out.println("Enter values respectively of flight class");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter airportName");
		//String airportName=s.next();
		a.setAirportName(s.next());
		
		System.out.println("Enter airportLocation");
		//String airportLocation=s.next();
		a.setAirportLocation(s.next());
		
		System.out.println("Enter airportCode");
		//String airportCode=s.next();
		a.setAirportCode(s.next());
		//a=new Airport(airportName, airportLocation, airportCode);
		//a=new Airport(airport.getAirportName(),s.next(), s.next());
		aColl.addAirportToCollection(a);
		
		
	}
	@Override
	public ArrayList<Airport> viewAirport()
	{
		System.out.println("Airport list is as follows");
		return aColl.viewAirportList();
		
	}
	@Override
	public Airport viewAirport(String airportCode)
	{
		System.out.println("Airport list is as follows");
		
		return aColl.viewAirport(airportCode);
		
	}

}
