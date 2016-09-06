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

    public String setChannelName(String channelName) {
        String out;

        if (channelName.equals("Discovery")& power == true || channelName.equals("1+1")& power == true || channelName.equals("MTV") & power == true) {
            this.channelName = channelName;
            out = (channelName + " is Playing");
        } else {
            out = " Error";
        }
        return out;
    }

    public String setVolume(int volume) {

        String out;

        if (volume <= 100 && volume >= 0 && power == true) {
            this.volume = volume;
            out = ("volume is " + volume + " % ");
        } else {
            out = " Error";
        }
        return out;

    }


    public boolean isPowerOn() {
        return power = true;
    }

    public boolean isPowerOf() {
        return power = false;
    }


}
