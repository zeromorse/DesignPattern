package N21_chain_of_responsibility.code;

/**
 * 抽象处理者
 *
 * @author Zero
 * @created 2017/5/24 21:20
 */
public abstract class Handler {

    protected Handler successor = null; // 下一个处理者

    /**
     * 调用此方法处理请求
     */
    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
