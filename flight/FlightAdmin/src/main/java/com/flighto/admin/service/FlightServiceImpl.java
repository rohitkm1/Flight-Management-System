 package com.flighto.admin.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.util.FlightCollection;

public class FlightServiceImpl implements FlightService{
	
	Flight flight = new Flight();
	FlightDaoImpl fDao = new FlightDaoImpl();
	FlightCollection fColl = new FlightCollection();
	Scanner s=new Scanner(System.in);
	@Override
	public Flight addFlight()
	{

		System.out.println("Enter values respectively of flight class");
		
		
		System.out.println("Enter flightModel");
		String flightModel=s.next();
		flight.setFlightModel(flightModel);
		
		System.out.println("Enter flightNumber");
		long flightNumber=s.nextLong();
		flight.setFlightNumber(flightNumber);
		
		System.out.println("Enter seatCapacity");
		int seatCapacity=s.nextInt();
		flight.setSeatCapacity(seatCapacity);
		
		System.out.println("Enter carrierName");
		String carrierName=s.next();
		flight.setCarrierName(carrierName);
		
		//flight = new Flight(flightModel, flightNumber, seatCapacity, carrierName);
		fColl.addFlightToCollection(flight);
		System.out.println("Added successfully");
		return flight;
		
	}
	@Override
	public Flight modifyFlight()
	{
		System.out.println("Enter flight Number");
		long flightNumber=s.nextLong();
		
		Flight flight = new Flight();
		
		Flight currentFlight = fColl.viewFlight(flightNumber);
		
		//System.out.println(currentFlight);
		
				flight.setCarrierName(currentFlight.getCarrierName());
		        flight.setFlightModel(currentFlight.getFlightModel());
		        flight.setFlightNumber(currentFlight.getFlightNumber());
		        
		        
		        System.out.println("Enter current available seats");
		        int seat = s.nextInt();
		        
		        flight.setSeatCapacity(seat);
 		        
               fColl.modifyFlight(flightNumber, flight);
		        
		return flight;
		
	}
	@Override
	public Flight viewFlight(long FlightNumber)
	{
		
		return fColl.viewFlight(FlightNumber);
		
	}
	@Override
	public ArrayList<Flight> viewFlight()
	{
		//System.out.println();
		//for(Flight f : fColl.viewFlightList())
		 // System.out.println(f.getFlightModel()); 
		return fColl.viewFlightList();
		
	}
	@Override
	public void deleteFlight(long FlightNumber)
	{
		fColl.deleteFlight(FlightNumber);
		System.out.println(FlightNumber + " is removed");
	}

}
