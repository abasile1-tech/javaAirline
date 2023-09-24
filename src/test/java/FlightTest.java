import org.example.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Passenger passenger7;
    private Passenger passenger8;
    private Passenger passenger9;
    private Passenger passenger10;

    private Passenger passenger11;

    private Passenger passenger12;

    private Passenger passenger13;

    private ArrayList<Passenger> passengers;

    private Plane plane;

    @Before
    public void before() {
        passenger1 = new Passenger("John", 1);
        passenger2 = new Passenger("Steven", 2);
        passenger3 = new Passenger("Julia", 4);
        passenger4 = new Passenger("Juanita", 1);
        passenger5 = new Passenger("Vern", 3);
        passenger6 = new Passenger("Rita",4);
        passenger7 = new Passenger("Noelle",3);
        passenger8 = new Passenger("Holly",2);
        passenger9 = new Passenger("Simon",2);
        passenger10 = new Passenger("Roger",0);
        passenger11 = new Passenger("Nicole",1);
        passenger12 = new Passenger("Eugene",1);
        passenger13 = new Passenger("Marcella",1);
        passengers = new ArrayList<>();
        pilot = new Pilot("Leslie", Rank.CAPTAIN, "5579283");
        cabinCrewMember1 = new CabinCrewMember("Ana", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Roger", Rank.FLIGHTATTENDANT);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(pilot);
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        plane = new Plane(PlaneType.ANTONOVaN2);
        flight = new Flight(pilot, cabinCrewMembers, plane, FlightNumber.FR756, Airport.EDI, Airport.LAS, "12:30 pm");
    }

    @Test
    public void canGetNumEmptySeats() {
        assertEquals(12, flight.getNumEmptySeats());
    }

    @Test
    public void canBookPassengerIfNotFull() {
        flight.addPassenger(passenger1);
        assertEquals(passenger1, flight.getPassengers().get(0));
    }

    @Test
    public void canNotBookPassengerIfFull() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger10);
        flight.addPassenger(passenger11);
        flight.addPassenger(passenger12);
        assertEquals(12, flight.getPassengers().size());
        assertEquals(false, flight.addPassenger(passenger13));
        flight.addPassenger(passenger13);
        assertEquals(12, flight.getPassengers().size());
    }
}
