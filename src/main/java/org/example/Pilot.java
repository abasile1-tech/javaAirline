package org.example;

public class Pilot extends CabinCrewMember{
    private String pilotLicenceNum;

    public Pilot(String name, Rank rank, String pilotLicenceNum) {
        super(name, rank);
        this.pilotLicenceNum = pilotLicenceNum;
    }

    public String getPilotLicenceNum() {
        return pilotLicenceNum;
    }

    public String flyThePlane() {
        return "I am flying the plane";
    }
}
