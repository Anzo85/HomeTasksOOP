package org.anzo.oop;

/**
 * Created by anzo0316 on 8/30/2016.
 */
public class TVremote {
    public static void main(String[] args) {


        TV myTV = new TV("Sony", "JS0001", 3);


        myTV.isPowerOn();
        myTV.setVolume(99);
        myTV.setChannelName("Discovery");
        myTV.setChannelName("1+1");
        myTV.setChannelName("MTV");
        myTV.isPowerOf();
        myTV.setChannelName("MTV");
    }
}
