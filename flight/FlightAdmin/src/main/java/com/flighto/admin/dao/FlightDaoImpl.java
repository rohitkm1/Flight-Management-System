package com.flighto.admin.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Flight;
import com.flighto.admin.util.FlightCollection;

public class FlightDaoImpl implements FlightDao {

	
	Scanner s = new Scanner(System.in);
	Flight o;
	FlightCollection fColl = new FlightCollection();
	//FlightDaoImpl fDao = new FlightDaoImpl();
	
	@Override
	public Flight addFlight()
	{
		return o;
	
	}
//	public Flight modifyFlight()
//	{
//		System.out.println("Enter flight Number");
//		long flightNumber=s.nextLong();
//		
//		
//		return fDao.modifyFlight(flightNumber);
//		
//	}
//	


	@Override
	public ArrayList viewFlight()
	{
		return fColl.viewFlightList();
		
	}
	@Override
	public void deleteFlight(long FlightNumber)
	{
		fColl.deleteFlight(FlightNumber);
		System.out.println(FlightNumber + "is removed");
	}

}
