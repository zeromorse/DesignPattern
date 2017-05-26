package N23_memento.multiple.code;

import java.util.ArrayList;

/**
 * 备忘录角色
 *
 * @author Zero
 * @created 2017/5/26 17:53
 */
public class Memento {
    private ArrayList<String> states;
    private int index;

    public Memento(ArrayList<String> states, int index) {
        this.states = (ArrayList) states.clone();
        this.index = index;
    }

    /**
     * 状态的取值方法
     */
    public ArrayList<String> getStates() {
        return states;
    }

    /**
     * 检查点取值方法
     */
    public int getIndex() {
        return index;
    }
}
