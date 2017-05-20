package N14_facade.code;

/**
 * 警报器
 *
 * @author Zero
 * @created 2017/4/30 22:42
 */
public class Alarm {
    public void activate() {
        System.out.println("Activating the alarm.");
    }

    public void deactivate() {
        System.out.println("Deactivating the alarm.");
    }

    public void ring() {
        System.out.println("Ring the alarm.");
    }

    public void stopRing() {
        System.out.println("Stop the alarm.");
    }
}
