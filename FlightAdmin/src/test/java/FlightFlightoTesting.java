import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.flighto.admin.bean.Flight;
import com.flighto.admin.dao.FlightDaoImpl;
import com.flighto.admin.service.FlightServiceImpl;
import com.flighto.admin.service.XceptionJava;
import com.flighto.admin.util.FlightCollection;

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
	void test2() throws XceptionJava
	{
		Flight flight=flightService.addFlight();
		assertEquals(23, flight.getSeatCapacity());
		assertEquals(1111, flight.getFlightNumber());
		assertEquals("GLOBEMASTER", flight.getFlightModel());
		assertEquals("BOEING", flight.getCarrierName());
	}
	@Test
	
	void test3()
	{
		//long flightNumber=5400;
		//ArrayList<Flight> flight3=flightService.viewFlight();
		assertEquals("carrier",flightService.viewFlight(1001).getCarrierName());
		
		
	}
	@Test
	void test4()
	{
		Flight flight2=flightService.modifyFlight();
		assertEquals(1001, flight2.getFlightNumber());
	}
	@Test
	void test5() throws XceptionJava
	{
		int flightNumber=4400;
		
		flightService.deleteFlight(flightService.addFlight().getFlightNumber());
	}
	private void assertTrue(Flight flight) {
		// TODO Auto-generated method stub
		
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}


}
