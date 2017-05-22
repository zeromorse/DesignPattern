package N19_observer.code;

/**
 * 具体观察者
 *
 * @author Zero
 * @created 2017/5/22 10:13
 */
public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("I am notified.");
    }
}
