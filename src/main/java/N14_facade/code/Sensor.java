package N14_facade.code;

/**
 * 感应器
 *
 * @author Zero
 * @created 2017/4/30 22:42
 */
public class Sensor {
    public void turnOn() {
        System.out.println("Turning on the camera.");
    }

    public void turnOff() {
        System.out.println("Turning off the camera.");
    }

    public void trigger() {
        System.out.println("The sensor has been triggered.");
    }
}
