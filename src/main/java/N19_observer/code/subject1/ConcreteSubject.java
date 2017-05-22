package N19_observer.code.subject1;

import N19_observer.code.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体观察者对象
 *
 * @author Zero
 * @created 2017/5/22 10:10
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
