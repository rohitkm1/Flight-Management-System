package com.flighto.admin.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.service.AirportServiceImpl;
import com.flighto.admin.service.FlightServiceImpl;

public class Admin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		AirportServiceImpl x= new AirportServiceImpl();
		FlightDaoImpl y=new FlightDaoImpl();
		
		FlightServiceImpl fServ = new FlightServiceImpl();

		
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
						x.addAirport();

						break;

					case 2:
						ArrayList<Airport> airport = x.viewAirport(); 
						
						for(Airport airP : airport)
						{
							System.out.println(airP.getAirportName()+"\t"+airP.getAirportLocation()+"\t"+airP.getAirportCode());
						}
						
						break;
						
					case 3:
						System.out.println("enter airport code");
						String airportCode = s.next();
						
						Airport air = x.viewAirport(airportCode);
						
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
				
				System.out.println("Enter 1 to add flight : \nEnter 2 to modify flight details : \nEnter 3 to view Flight by flightNumber : \nEnter 4 to view all flights : \nEnter 5 to delete any flight by flight Number : \nEnter 6 to validate flights :");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
					fServ.addFlight();
					break;
					
				case 2:
					Flight f = fServ.modifyFlight();
					
					//System.out.println(f);
					break;
					
				case 3:
					System.out.println("enter flight Number");
					Long flightNumber = s.nextLong();
					
					Flight fli = fServ.viewFlight(flightNumber);
					
					System.out.println(fli.getFlightModel()+"\t"+fli.getFlightNumber()+"\t"+fli.getSeatCapacity()+"\t"+fli.getCarrierName());
					break;
					
				case 4:
					ArrayList<Flight> flight = fServ.viewFlight(); 
					for(Flight flightP : flight)
					{
						System.out.println(flightP.getFlightModel()+"\t"+flightP.getFlightNumber()+"\t"+flightP.getSeatCapacity()+"\t"+flightP.getCarrierName());
					}
					//y.viewFlight();
					break;
					
				case 5:
					System.out.println("Enter flight number");
					long flightNumber1=s.nextLong();
					y.deleteFlight(flightNumber1);				
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
