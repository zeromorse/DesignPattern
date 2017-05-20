package N14_facade.code;

/**
 * 客户
 *
 * @author Zero
 * @created 2017/4/30 22:43
 */
public class SecurityFacade {
    private Camera camera1, camera2;
    private Light light1, light2, light3;
    private Sensor sensor;
    private Alarm alarm;

    {
        camera1 = new Camera();
        camera2 = new Camera();
        light1 = new Light();
        light2 = new Light();
        light3 = new Light();
        sensor = new Sensor();
        alarm = new Alarm();
    }

    public void activate() {
        camera1.turnOn();
        camera2.turnOn();
        light1.turnOn();
        light2.turnOn();
        light3.turnOn();
        sensor.turnOn();
        alarm.activate();
    }

    public void deactivate() {
        camera1.turnOff();
        camera2.turnOff();
        light1.turnOff();
        light2.turnOff();
        light3.turnOff();
        sensor.turnOff();
        alarm.deactivate();
    }
}
