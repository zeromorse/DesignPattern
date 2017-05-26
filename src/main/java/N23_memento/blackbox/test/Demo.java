package N23_memento.blackbox.test;

import N23_memento.blackbox.code.Caretaker;
import N23_memento.blackbox.code.Originator;

public class Demo {
    private static Originator originator = new Originator(); // 发起人角色
    private static Caretaker caretaker = new Caretaker(); // 负责人角色

    public static void main(String[] args) {
        originator.setState("On"); // 改变发起人状态
        caretaker.saveMemento(originator.createMemento()); // 创建备忘录对象，并将发起人状态存储起来
        originator.setState("Off"); // 改变发起人状态
        originator.restoreMemento(caretaker.retrieveMemento()); // 根据负责人持有的备忘录对象恢复发起人对象
        System.out.println("Final state : " + originator.getState()); // 输出最终的发起人状态
    }
}
