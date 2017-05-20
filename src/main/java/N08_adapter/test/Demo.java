package N08_adapter.test;

import N08_adapter.code.Adaptee;
import N08_adapter.code.Target;

public class Demo {
    public static void main(String[] args) {
        // 测试类实现的适配器
        Target target1 = new N08_adapter.code.impl.clazz.Adapter();

        // 测试对象实现的适配器
        Adaptee adaptee = new Adaptee();
        Target target2 = new N08_adapter.code.impl.object.Adapter(adaptee);
    }
}
