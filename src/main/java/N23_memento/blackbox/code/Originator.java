package N23_memento.blackbox.code;

/**
 * 发起人角色
 *
 * @author Zero
 * @created 2017/5/26 14:16
 */
public class Originator {
    private String state;

    /**
     * 工厂方法：创建备忘录对象
     */
    public MementoIF createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录所记录的状态
     */
    public void restoreMemento(MementoIF mementoIF) {
        this.state = ((Memento) mementoIF).getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Current state : " + state);
        this.state = state;
    }

    /**
     * 备忘录角色（宽接口）
     */
    protected class Memento implements MementoIF{
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
