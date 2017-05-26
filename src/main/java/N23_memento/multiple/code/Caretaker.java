package N23_memento.multiple.code;

import java.util.ArrayList;

/**
 * 负责人角色
 *
 * @author Zero
 * @created 2017/5/26 18:02
 */
public class Caretaker {
    private Originator originator;
    private ArrayList<Memento> mementos = new ArrayList<>();
    private int current;

    public Caretaker(Originator originator) {
        this.originator = originator;
        current = 0;
    }

    /**
     * 创建一个新检查点
     */
    public int createMemento() {
        Memento memento = originator.createMemento();
        mementos.add(memento);
        return current++;
    }

    /**
     * 将发起人恢复到某个检查点
     */
    public void restoreMemento(int index) {
        Memento memento = mementos.get(index);
        originator.restoreMemento(memento);
    }

    /**
     * 将某个检查点删除
     */
    public void removeMemento(int index) {
        mementos.remove(index);
    }
}
