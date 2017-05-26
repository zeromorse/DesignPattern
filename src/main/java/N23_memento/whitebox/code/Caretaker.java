package N23_memento.whitebox.code;

/**
 * 负责人角色
 *
 * @author Zero
 * @created 2017/5/26 16:31
 */
public class Caretaker {
    private Memento memento;

    /**
     * 遍历备忘录对象
     */
    public Memento retrieveMemento() {
       return memento;
    }

    /**
     * 设置备忘录方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
