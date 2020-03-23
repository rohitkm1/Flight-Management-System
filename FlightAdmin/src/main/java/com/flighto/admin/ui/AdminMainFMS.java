package com.flighto.admin.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.service.AirportServiceImpl;
import com.flighto.admin.service.FlightServiceImpl;
import com.flighto.admin.service.XceptionJava;

public class AdminMainFMS {

	public static void main(String[] args) {
		
		System.out.println("Welcome to FLIGHTO");
		System.out.println("Enter number accordingly :-");
		System.out.println("\n");
		
		Scanner s = new Scanner(System.in);
		
		AirportServiceImpl airServImpl= new AirportServiceImpl();
		FlightDaoImpl fliDaoImpl=new FlightDaoImpl();
		
		FlightServiceImpl fliServImpl = new FlightServiceImpl();

		
		boolean b = true;
		while(b)
		{
			System.out.println("Enter 1 to refer Airport : \nEnter 2 to refer Flight :");
			int choicee=s.nextInt();
			switch(choicee)
			{
			case 1:
                    boolean b1 = true;
				while(b1)
					
				{
					System.out.println("Enter 1 to add Airport : \nEnter 2 to view Airports : \nEnter 3 to view Airport by aiportCode :");
					int choice = s.nextInt();
					switch (choice) {
					case 1:
						airServImpl.addAirport();

						break;

					case 2:
						ArrayList<Airport> airport = airServImpl.viewAirport(); 
						
						for(Airport airP : airport)
						{
							System.out.println(airP.getAirportName()+"\t"+airP.getAirportLocation()+"\t"+airP.getAirportCode());
						}
						
						break;
						
					case 3:
						System.out.println("enter airport code");
						String airportCode = s.next();
						
						Airport air = airServImpl.viewAirport(airportCode);
						
						System.out.println(air.getAirportName()+"\t"+air.getAirportLocation()+"\t"+air.getAirportCode());
						
						break;
					
						
					default:
						b1 = false;
						break;
					}
						
				
				}
				
			
			case 2:
				
				boolean b2 = true;
				
			while(b2)
			{
				
				System.out.println("Enter 1 to add flight : \nEnter 2 to modify flight details : \nEnter 3 to view Flight by flightNumber : \nEnter 4 to view all flights : \nEnter 5 to delete any flight by flight Number : ");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
					try {
						fliServImpl.addFlight();
					} catch (XceptionJava zeroSeat) {
					
						System.out.println("Seat capacity must be more than zero");
//						zeroSeat.printStackTrace();
					}
					break;
					
				case 2:
					Flight f = fliServImpl.modifyFlight();
					
					//System.out.println(f);
					break;
					
				case 3:
					System.out.println("enter flight Number");
					Long flightNumber = s.nextLong();
					
					Flight fli = fliServImpl.viewFlight(flightNumber);
					
					System.out.println(fli.getFlightModel()+"\t"+fli.getFlightNumber()+"\t"+fli.getSeatCapacity()+"\t"+fli.getCarrierName());
					break;
					
				case 4:
					ArrayList<Flight> flight = fliServImpl.viewFlight(); 
					for(Flight flightP : flight)
					{
						System.out.println(flightP.getFlightModel()+"\t"+flightP.getFlightNumber()+"\t"+flightP.getSeatCapacity()+"\t"+flightP.getCarrierName());
					}
					//y.viewFlight();
					break;
					
				case 5:
					System.out.println("Enter flight number");
					long flightNumber1=s.nextLong();
					fliDaoImpl.deleteFlight(flightNumber1);				
					break;
					
				default:
					b2 = false;
					break;
				}
				
			}
			
			
		}

		}
		

	}

}
