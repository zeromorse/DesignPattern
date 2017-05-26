package N23_memento.whitebox.code;

/**
 * 备忘录角色
 *
 * @author Zero
 * @created 2017/5/26 14:16
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
