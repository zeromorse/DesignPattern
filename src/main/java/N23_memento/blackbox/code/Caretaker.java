package N23_memento.blackbox.code;

/**
 * 负责人角色
 *
 * @author Zero
 * @created 2017/5/26 16:31
 */
public class Caretaker {
    private MementoIF memento;

    /**
     * 遍历备忘录对象
     */
    public MementoIF retrieveMemento() {
        return memento;
    }

    /**
     * 设置备忘录方法
     */
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
