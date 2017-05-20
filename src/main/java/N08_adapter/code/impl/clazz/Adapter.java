package N08_adapter.code.impl.clazz;

import N08_adapter.code.Adaptee;
import N08_adapter.code.Target;

/**
 * 通过类实现适配器（通过继承实现）
 *
 * @author Zero
 * @created 2017/4/24 10:31
 */
public class Adapter extends Adaptee implements Target {
    public void simpleOperation2() {}
}
