package N08_adapter.code.impl.object;

import N08_adapter.code.Adaptee;
import N08_adapter.code.Target;

/**
 * 通过对象实现适配器（通过关联实现）
 *
 * @author Zero
 * @created 2017/4/24 10:33
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }

    public void simpleOperation2() {
    }
}
