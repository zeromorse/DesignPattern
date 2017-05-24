package N15_bridge.code;

/**
 * 修正的抽象化角色
 *
 * @author Zero
 * @created 2017/5/3 19:33
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    // 某个商业方法的修正抽象化角色实现
    @Override
    public void operation() {
        super.operation();
        System.out.println("I still have something to say.");
    }
}
