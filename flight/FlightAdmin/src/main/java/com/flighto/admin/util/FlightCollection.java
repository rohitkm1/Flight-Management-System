package com.flighto.admin.util;

import java.util.ArrayList;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;

public class FlightCollection {

	private ArrayList<Flight> flightList=new ArrayList<Flight>();
	
	public void addFlightToCollection(Flight f)
	{
		flightList.add(f);
	}
	public Flight viewFlight(long flightNumber)
	{
		for(int i =0; i<flightList.size(); i++) {
			if(flightList.get(i).getFlightNumber()==(flightNumber))
			{
 						
				return flightList.get(i);
			}
		}		
		return null;
		
	}
	public Flight modifyFlight(long fNumber, Flight flight)
	{
		int index =0;
		
		for(int i=0; i<flightList.size(); i++)
		{
		if(flightList.get(i).getFlightNumber() == fNumber)
			index = i;
		}
		
		flightList.set(index, flight);
		
		return null;
		
	}
	public ArrayList<Flight> viewFlightList()
	
	{
		return flightList;
		
	}
	public void deleteFlight(long flightNumber)
	{
//		for(Flight w: flightList) {
//			if(w.getFlightNumber()==(flightNumber))
//			{
//				flightList.remove(w);
//			}
//		}
		
		if(flightList.contains(flightNumber))
		{
			flightList.remove(flightNumber);
		}
		
	}
	
}
