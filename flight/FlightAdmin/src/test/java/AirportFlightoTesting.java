import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.flighto.admin.bean.Airport;
import com.flighto.admin.bean.Flight;
import com.flighto.admin.service.AirportServiceImpl;

class AirportFlightoTesting {
	
	AirportServiceImpl airportServiceImpl=new AirportServiceImpl();
	
//	@Test
//	void test()
//	{
//		Airport airport=airportServiceImpl.addAirport();
//		
//	}

	@Test
	void test1()
	{
		ArrayList<Airport> airport1=airportServiceImpl.viewAirport();
		assertTrue(airport1.isEmpty());
	}
}
