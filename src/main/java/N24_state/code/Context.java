package N24_state.code;

/**
 * 环境角色
 *
 * @author Zero
 * @created 2017/5/27 23:56
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void sampleOperation() {
        state.sampleOperation();
    }
}
