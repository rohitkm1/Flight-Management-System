package com.flighto.admin.util;

import java.util.ArrayList;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;

public class AirportCollection {
	
	private ArrayList<Airport> airportList=new ArrayList<Airport>();
	
	public void addAirportToCollection(Airport f1)
	{
		airportList.add(f1);
	}
	
	public Airport viewAirport(String airportCode)
	{
		for(Airport v: airportList) {
			if(v.getAirportCode().equals(airportCode))
			{
				System.out.println("1.AirportName 2.AirportLocation 3.AirportCode");

				return v;
			}
		}
		
		return null;
		
	}
	public ArrayList viewAirportList()
	
	{
		System.out.println("1.AirportName\t2.AirportLocation\t3.AirportCode");

		return airportList;
		
	}

}
