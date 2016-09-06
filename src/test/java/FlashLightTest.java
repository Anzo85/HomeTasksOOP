package OopTests;

import org.anzo.oop.Flashlight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlashLightTest {
    Flashlight test;

    @Before

    public void start() {
        test = new Flashlight("Test");
    }

    @Test

    public void setBatteryNull() {


        test.setBattery(0);
        Assert.assertEquals(" Please insert Battery", test.switchOnWhite());
        Assert.assertEquals(" Error: You need more battery", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());

    }

    @Test

    public void setBatteryOne() {

        test.setBattery(1);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Error: You need more battery", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());
    }

    @Test

    public void setBatteryTwo() {
        test.setBattery(2);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Red is shine ", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());
    }

    @Test

    public void setBatteryFull() {
        test.setBattery(3);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Red is shine ", test.switchOnRed());
        Assert.assertEquals(" Flashing ", test.switchOnFlash());


    }


}
