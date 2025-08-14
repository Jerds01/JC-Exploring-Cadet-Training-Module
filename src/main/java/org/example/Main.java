package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Deploying QuadCopter Unit ---");
        QuadCopter bravo_1 = new QuadCopter("Bravo-1");

        bravo_1.takeOff();
        bravo_1.fly();

        System.out.println("\n Engaging REcon Capabilities");

        bravo_1.takePicture();

        bravo_1.record4kVideo();

        System.out.println("Standard Lens Type: "+ VisualRecon.getStandardLensType());

        bravo_1.land();

        System.out.println("\n\n--- Deploying Advanced Fixed-Wing Unit ---");
        FixedWingDrone phoenix_7 = new FixedWingDrone("Phoenix-7");
        phoenix_7.takeOff();
        phoenix_7.fly();
        phoenix_7.takePicture();
        phoenix_7.interceptSignal();
        phoenix_7.record4kVideo(); // Calls the overridden version
        phoenix_7.land();

    }
}