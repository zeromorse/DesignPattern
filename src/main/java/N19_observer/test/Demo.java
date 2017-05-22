package N19_observer.test;

import N19_observer.code.ConcreteObserver;
import N19_observer.code.Observer;
import N19_observer.code.subject2.ConcreteSubject;

public class Demo {
    private static ConcreteSubject subject;
    private static Observer observer;

    public static void main(String[] args) {
        subject = new ConcreteSubject();
        observer = new ConcreteObserver();

        subject.attach(observer);
        subject.change("new state");
    }
}
