package N23_memento.multiple.code;

import java.util.ArrayList;

/**
 * 发起人角色
 *
 * @author Zero
 * @created 2017/5/26 17:50
 */
public class Originator {
    private ArrayList<String> states;
    private int index;

    public Originator() {
        states = new ArrayList<>();
        index = 0;
    }

    /**
     * 创建一个新的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(states, index);
    }

    /**
     * 将发起人恢复到备忘录记录的状态上
     */
    public void restoreMemento(Memento memento) {
        states = memento.getStates();
        index = memento.getIndex();
    }

    /**
     * 状态的赋值方法
     */
    public void setState(String state) {
        states.add(state);
        index++;
    }

    /**
     * 辅助方法：打印出所有的状态
     */
    public void printStates() {
        System.out.println("Total number of states : " + index);
        for (String state : states) {
            System.out.println(state);
        }
    }
}
