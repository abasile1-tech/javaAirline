package org.example;

public enum PlaneType {
    BOEING747(366, 183_500),
    CONCORDE(100, 78_700),
    AIRBUSa380(853, 361_000),
    ANTONOVaN2(12, 3_300);

    private int passengerCapacity;
    private int emptyWeight;

    PlaneType(int passengerCapacity, int emptyWeight) {
        this.passengerCapacity = passengerCapacity;
        this.emptyWeight = emptyWeight;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }
}
