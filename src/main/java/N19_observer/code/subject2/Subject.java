package N19_observer.code.subject2;

import N19_observer.code.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 抽象主题角色
 *
 * @author Zero
 * @created 2017/5/22 10:32
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();
    /**
     * 登记一个新的观察者对象
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除一个已经登记的观察者对象
     */
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有登记过的观察者对象
     */
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    /**
     * 给出观察者聚集的 Observer 对象
     */
    public Iterator<Observer> observers() {
        return observerList.iterator();
    }
}
