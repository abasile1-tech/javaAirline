package org.example;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private FlightNumber flightNumber;
    private Airport destinationAirport;
    private Airport departureAirport;

    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, FlightNumber flightNumber, Airport destinationAirport, Airport departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumEmptySeats() {
        return this.plane.getPlaneType().getPassengerCapacity() - this.getPassengers().size();
    }

    public boolean addPassenger(Passenger passenger) {
        if (this.getNumEmptySeats() > 0) {
            this.passengers.add(passenger);
            return true;
        }
        return false;
    }
}
