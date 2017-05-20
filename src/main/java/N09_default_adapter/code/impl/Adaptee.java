package N09_default_adapter.code.impl;

/**
 * 被适配的对象（窄化接口）
 *
 * @author Zero
 * @created 2017/4/24 10:52
 */
public class Adaptee extends DefaultAdapter {
    public void method3() {
        System.out.println("I just want to implements method3");
    }
}
