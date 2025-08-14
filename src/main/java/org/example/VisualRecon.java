package org.example;

public interface VisualRecon {
    String SENSOR_TYPE = "High-Resolution Optical Camera";

    void takePicture();

    default void record4kVideo(){
        System.out.println("Recording 4K video using default settings.");
    }

    static String getStandardLensType(){
        return "50mm Standard Lens";
    }
}
