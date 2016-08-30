package org.anzo.oop;

import java.util.EmptyStackException;

public class Flashlight {

    private String name;
    private int battery;
    private String mode;

    public Flashlight(String name) {
        this.name = name;
    }

    public void setBattery(int battery) {
        try{
        if (battery <= 3) {
            this.battery = battery;
            System.out.println(battery + " battery has been inserted");
        }
        else throw new IllegalArgumentException();
    }
    catch (Exception e){
        System.out.println(e);}
    }

    public String switchOnWhite() {
        if (battery >= 1) {
            mode = " Withe is shine ";
        } else {
            mode = " Please insert Battery";
        }
        return mode;
    }

    public String switchOnRed() {
        if (battery > 1) {
            mode = " Red is shine ";
        } else
            mode = " Error: You need more battery";
        return mode;
    }

    public String switchOnFlash() {
        if (battery > 2) {
            mode = " Flashing ";
        } else {
            mode = " Error: You need more battery";
        }
        return mode;
    }

    public String switchOff() {
        mode = null;
        return mode;
    }


}
