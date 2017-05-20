package N09_default_adapter.code.impl;

import N09_default_adapter.code.Target;

/**
 * 目标接口的默认适配
 *
 * @author Zero
 * @created 2017/4/24 10:51
 */
public abstract class DefaultAdapter implements Target {
    public void method1() {
        throw new UnsupportedOperationException();
    }

    public void method2() {
        throw new UnsupportedOperationException();
    }

    public void method3() {
        throw new UnsupportedOperationException();
    }

    public void method4() {
        throw new UnsupportedOperationException();
    }

    public void method5() {
        throw new UnsupportedOperationException();
    }
}
