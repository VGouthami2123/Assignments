package com.Gouthamiv.model;
import java.util.ArrayList;

public class Airport 
{
	ArrayList<Flight>flights;
	ArrayList<Traveller>travellers;
	public Airport()
	{
		flights = new ArrayList<>();
		travellers = new ArrayList<>();
	}
	public boolean addFlight(Flight flight)
	{
		return flights.add(flight);
		
	}
	public ArrayList<Flight>
	searchFlightsBySourceAndDestination(String source,String destination)
	{
		ArrayList<Flight>foundFlights = new ArrayList<>();
		for(Flight flight:flights)
		{
			if(flight.getSource().equals(source) && flight.getDestination().equals(destination))
			{
				foundFlights.add(flight);
			}
		}
		return foundFlights;
	}
	public void bookticket(String FlightId,Traveller traveller)
	{
		for(Flight flight:flights)
		{
			if(flight.getFlightId().equals(FlightId) && flight.getAvailableseats() > 0)
			{
				travellers.add(traveller);
				flight.setAvailableseats(flight.getAvailableseats() - 1);
				break;
			}
			
		}
		
	}
			

}
