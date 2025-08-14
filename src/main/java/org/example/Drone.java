package org.example;

public abstract class Drone {
    private String callsign;

    public Drone(String callsign){
        this.callsign = callsign;
    }

    public void takeOff(){
        System.out.println(callsign+ " is taking off");
    }

    public void land(){
        System.out.println(callsign+ " is landing.");
    }

    public abstract void fly();

    public String getCallsign(){
        return this.callsign;
    }
}
