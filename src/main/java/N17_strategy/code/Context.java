package N17_strategy.code;

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
        System.out.println("Choosing strategy finish.");
        strategy.strategyInterface();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
