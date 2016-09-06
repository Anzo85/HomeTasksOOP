package org.anzo.oop;

public class TVremote {
    public static void main(String[] args) {


        TV myTV = new TV("Sony", "JS0001", 3);


         myTV.isPowerOn();
        System.out.println(myTV.setVolume(97));
        System.out.println(myTV.setChannelName("Discovery"));
        System.out.println(myTV.setChannelName("1+1"));
        System.out.println(myTV.setChannelName("MTV"));
        myTV.isPowerOf();
        System.out.println(myTV.setChannelName("MTV"));
    }
}
