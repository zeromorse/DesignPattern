package N19_observer.code.subject2;

/**
 * 具体观察者对象
 *
 * @author Zero
 * @created 2017/5/22 10:10
 */
public class ConcreteSubject extends Subject {
    private String state;

    /**
     * 调用这个方法改变主题的状态
     */
    public void change(String newState) {
        this.state = newState;
        super.notifyObservers();
    }
}
