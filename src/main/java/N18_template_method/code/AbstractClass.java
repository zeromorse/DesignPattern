package N18_template_method.code;

/**
 * 抽象模板类
 *
 * @author Zero
 * @created 2017/5/21 21:24
 */
public abstract class AbstractClass {
    /**
     * 模板方法的声明和实现
     */
    public void templateMethod() {
        // 调用基本的方法 1 （由子类实现）
        doOperation1();
        // 调用基本的方法 2 （由子类实现）
        doOperation2();
        // 调用基本的方法 3 （已经实现）
        doOperation3();
    }

    protected abstract void doOperation1();

    protected abstract void doOperation2();

    private final void doOperation3() {
        System.out.println("I have a private method!");
    }
}
