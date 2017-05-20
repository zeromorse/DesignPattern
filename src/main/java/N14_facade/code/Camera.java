package N14_facade.code;

/**
 * 录像机
 *
 * @author Zero
 * @created 2017/4/30 22:41
 */
public class Camera {
    public void turnOn() {
        System.out.println("Turning on the camera.");
    }

    public void turnOff() {
        System.out.println("Turning off the camera.");
    }

    public void rotate(int degree) {
        System.out.println("rotating the camera by " + degree + " degree.");
    }
}
