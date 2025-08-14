package org.example;

public class QuadCopter extends Drone implements VisualRecon {
    public QuadCopter(String callsign){
        super(callsign);
    }



    public void fly(){
        System.out.println(getCallsign()+ " is hovering with four rotors");
    }

    public void takePicture(){
        System.out.println(getCallsign()+" takes a picture with its " + SENSOR_TYPE);
    }

}
