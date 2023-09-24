package org.example;

public class Pilot extends CabinCrewMember{
    private String pilotLicenceNum;

    public Pilot(String name, Rank rank, String pilotLicenceNum) {
        super(name, rank);
        this.pilotLicenceNum = pilotLicenceNum;
    }
}
