import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.service.FlightServiceImpl;

class FlightFlightoTesting {
	
	FlightServiceImpl flightService = new FlightServiceImpl();

	@Test
	void test1() 
	{
			
		//fail("Not yet implemented");

		
		ArrayList<Flight> flight1=flightService.viewFlight();
		assertTrue(flight1.isEmpty());
	}
	@Test
	void test2()
	{
		Flight flight=flightService.addFlight();
		assertEquals(23, flight.getSeatCapacity());
	}
	@Test
	void test3()
	{
		ArrayList<Flight> flight3=flightService.viewFlight();
		assertTrue(flight3.isEmpty());
		//Flight flight=flightService.viewFlight(FlightNumber);
		
	}
//	@Test
//	void test4()
//	{
//		Flight flight2=flightService.modifyFlight();
//		assertEquals(23, flight2.getFlightNumber());
//	}

}
