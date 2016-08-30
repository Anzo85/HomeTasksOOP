package org.anzo.oop;


public class FlashLightUse {

    public static void main(String[] args) {
        String switchOn;

        Flashlight Sony = new Flashlight("Sony");
        // without battery
        switchOn = Sony.switchOnWhite();
        System.out.println(switchOn);
        // 1 battery
        Sony.setBattery(1);
        switchOn = Sony.switchOnWhite();
        System.out.println(switchOn);
        //  try red
        switchOn = Sony.switchOnRed();
        System.out.println(switchOn);
        // try flash
        switchOn = Sony.switchOnFlash();
        System.out.println(switchOn);
        // 2 battery try red , try white , try flash
        Sony.setBattery(2);
        switchOn = Sony.switchOnRed();
        System.out.println(switchOn);
        switchOn = Sony.switchOnWhite();
        System.out.println(switchOn);
        switchOn = Sony.switchOnFlash();
        System.out.println(switchOn);
        // 3 battery
        Sony.setBattery(3);
        switchOn = Sony.switchOnRed();
        System.out.println(switchOn);
        switchOn = Sony.switchOnWhite();
        System.out.println(switchOn);
        switchOn = Sony.switchOnFlash();
        System.out.println(switchOn);
        System.out.println(Sony.switchOff());

        Sony.setBattery(4);








    }
}
