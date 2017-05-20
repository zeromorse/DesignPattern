package N17_Strategy.code;

/**
 * 环境角色
 *
 * @author Zero
 * @created 2017/5/20 15:47
 */
public class Context {
    private Strategy strategy;

    /**
     * 策略方法
     */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
