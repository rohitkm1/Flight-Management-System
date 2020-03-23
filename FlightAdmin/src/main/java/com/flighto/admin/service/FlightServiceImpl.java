 package com.flighto.admin.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.util.FlightCollection;

public class FlightServiceImpl implements FlightService{
	
	
	FlightDaoImpl fDao = new FlightDaoImpl();
	FlightCollection fColl = new FlightCollection();
	Scanner s=new Scanner(System.in);
	@Override
	public Flight addFlight() throws XceptionJava
	{

		Flight flight = new Flight();
		System.out.println("Enter values respectively of flight class");
		
		
		System.out.println("Enter flightModel");
		String flightModel=s.next();
		
		boolean val=true;
		while(val)
		{
			
			boolean valid=FlightValidation.validateData(flightModel, FlightValidation.flightModel);
			
			if(valid)
			{
				val=false;
			}
			else
			{
				System.out.println("Flight model is not valid please enter again");
				flightModel=s.next();
			}
		}
		flight.setFlightModel(flightModel);
		
		
		
		System.out.println("Enter flightNumber");
		long flightNumber=s.nextLong();
		
		boolean val1 = true;
		while(val1)
		{
			String str1 = String.valueOf(flightNumber);
			
			boolean valid1 = FlightValidation.validateData1(str1, FlightValidation.flightNumber);
			
			if(valid1)
			{
				val1 = false;
			}
			else
			{
				System.out.println("Flight number is not valid please enter again");
				flightNumber = s.nextLong();
			}
			
		}
		flight.setFlightNumber(flightNumber);
		
		
		
		boolean val2 = true;
		while(val2)
		{
			System.out.println("Enter seatCapacity");
			int seatCapacity=s.nextInt();
		
		if(seatCapacity == 0)
		{
			throw new XceptionJava();
		}
		else
			flight.setSeatCapacity(seatCapacity);
		   	val2 = false;
		}
		
		System.out.println("Enter carrierName");
		String carrierName=s.next();
		
		boolean val3=true;
		while(val3)
		{
			
			boolean valid3=FlightValidation.validateData3(carrierName, FlightValidation.carrierName);
			
			if(valid3)
			{
				val3=false;
			}
			else
			{
				System.out.println("Carrier Name is not valid please enter again");
				carrierName=s.next();
			}
		}
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
 		        
              //System.out.println("inside"+fColl.modifyFlight(flightNumber, flight).getSeatCapacity());
		        return fColl.modifyFlight(flightNumber, flight);
		
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
		System.out.println(FlightNumber + "\tis removed");
	}

}
