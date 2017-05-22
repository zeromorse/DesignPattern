package N19_observer.code.subject1;

import N19_observer.code.Observer;

/**
 * 抽象主题角色
 *
 * @author Zero
 * @created 2017/5/22 10:06
 */
public interface Subject {
    /**
     * 登记一个新的观察者对象
     */
    void attach(Observer observer);

    /**
     * 删除一个已经登记的观察者对象
     */
    void detach(Observer observer);

    /**
     * 通知所有登记过的观察者对象
     */
    void notifyObservers();
}
