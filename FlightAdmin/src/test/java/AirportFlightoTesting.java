import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;
import com.flighto.admin.service.AirportServiceImpl;

class AirportFlightoTesting {
	
	AirportServiceImpl airportService=new AirportServiceImpl();
	

	@Test
	void test1()
	{	
		airportService.addAirport();
	}
	@Test
	void test2()
	{
		ArrayList<Airport> airport=airportService.viewAirport();
		assertTrue(airport.isEmpty());
	}
	@Test
	void test3()
	{
		String airportCode="ETAF";
		assertTrue(airportService.viewAirport(airportCode));
	}
	private void assertTrue(Airport viewAirport) {
		// TODO Auto-generated method stub
		
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
