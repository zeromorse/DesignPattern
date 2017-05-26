package N23_memento.multiple.test;

import N23_memento.multiple.code.Caretaker;
import N23_memento.multiple.code.Originator;

public class Demo {
    private static Originator originator = new Originator();
    private static Caretaker caretaker = new Caretaker(originator);

    public static void main(String[] args) {
        String state_ = "state ";
        originator.setState(state_ + "0"); // 改变状态
        caretaker.createMemento(); // 建立一个检查点
        originator.setState(state_ + "1"); // 改变状态
        caretaker.createMemento(); // 建立一个检查点
        originator.setState(state_ + "2"); // 改变状态
        caretaker.createMemento(); // 建立一个检查点
        originator.setState(state_ + "3"); // 改变状态
        caretaker.createMemento(); // 建立一个检查点
        originator.setState(state_ + "4"); // 改变状态
        caretaker.createMemento(); // 建立一个检查点
        originator.printStates(); // 打印出所有的检查点

        System.out.println("Restoring to 2");
        caretaker.restoreMemento(2);
        originator.printStates();
        System.out.println("Restoring to 0");
        caretaker.restoreMemento(0);
        originator.printStates();
        System.out.println("Restoring to 3");
        caretaker.restoreMemento(3);
        originator.printStates();
    }
}
