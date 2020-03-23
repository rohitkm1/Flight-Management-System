package com.flighto.admin.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.util.AirportCollection;

public class AirportServiceImpl implements AirportService{
	
	
	AirportCollection aColl=new AirportCollection();
	
	@Override
	public void addAirport()
	{
		Airport airPo =new Airport();
		
		System.out.println("Enter values respectively of flight class");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter airportName");
		String airportName=s.next();
		
		boolean val4=true;
		while(val4)
		{
			
			boolean valid4=AirportValidation.validateData4(airportName, AirportValidation.airportName);
			
			if(valid4)
			{
				val4=false;
			}
			else
			{
				System.out.println("Airport name is not valid please enter again");
				airportName=s.next();
			}
		}
		airPo.setAirportName(airportName);
		
		System.out.println("Enter airportLocation");
		String airportLocation=s.next();
		
		boolean val5=true;
		while(val5)
		{
			
			boolean valid5=AirportValidation.validateData5(airportLocation, AirportValidation.airportLocation);
			
			if(valid5)
			{
				val5=false;
			}
			else
			{
				System.out.println("Airport location is not valid please enter again");
				airportName=s.next();
			}
		}
		airPo.setAirportLocation(airportLocation);
		
		System.out.println("Enter airportCode");
		airPo.setAirportCode(s.next());
		//a=new Airport(airportName, airportLocation, airportCode);
		//a=new Airport(airport.getAirportName(),s.next(), s.next());
		aColl.addAirportToCollection(airPo);
		
		
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
