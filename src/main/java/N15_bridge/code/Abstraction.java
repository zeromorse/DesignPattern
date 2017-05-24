package N15_bridge.code;

/**
 * 抽象化角色
 *
 * @author Zero
 * @created 2017/5/3 19:22
 */
abstract public class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    // 某个商业方法
    public void operation() {
        impl.operationImpl();
    }
}
