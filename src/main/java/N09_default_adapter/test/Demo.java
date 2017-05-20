package N09_default_adapter.test;

import N09_default_adapter.code.Target;
import N09_default_adapter.code.impl.Adaptee;

public class Demo {
    public static void main(String[] args) {
        Target target = new Adaptee();
        target.method3();
        target.method1();
    }
}
