import org.anzo.oop.Flashlight;
import org.junit.Assert;
import org.junit.Test;

public class FlashLightTest {


    @Test

    public void Test01() {

        Flashlight test = new Flashlight("Test");
        test.setBattery(0);
        Assert.assertEquals(" Please insert Battery", test.switchOnWhite());
        Assert.assertEquals(" Error: You need more battery", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());
        test.setBattery(1);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Error: You need more battery", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());
        test.setBattery(2);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Red is shine ", test.switchOnRed());
        Assert.assertEquals(" Error: You need more battery", test.switchOnFlash());
        test.setBattery(3);
        Assert.assertEquals(" Withe is shine ", test.switchOnWhite());
        Assert.assertEquals(" Red is shine ", test.switchOnRed());
        Assert.assertEquals(" Flashing ", test.switchOnFlash());


    }


}
