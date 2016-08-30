package org.anzo.oop;


public class TV {

    private String manufacture;

    private String model;

    private int channel;

    private int volume;

    private String channelName;

    private boolean power;

    public TV(String manufacture, String model, int channel) {
        this.manufacture = manufacture;
        this.model = model;
        this.channel = channel;
    }

    public void setChannelName(String channelName) {
        try {
            if (channelName.equals("Discovery") || channelName.equals("1+1") || channelName.equals("MTV")) {
                this.channelName = channelName;
            } else throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (power == true) {
            System.out.println(channelName + " is Playing");
        }
    }

    public void setVolume(int volume) {
        try {
            if (volume <= 100 && volume >= 0 && power == true) {
                this.volume = volume;
                System.out.println("volume is " + volume + " % ");
            } else throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public boolean isPowerOn() {
        return power = true;
    }

    public boolean isPowerOf() {
        return power = false;
    }


}