package N18_template_method.code;

/**
 * 具体模板类
 *
 * @author Zero
 * @created 2017/5/21 21:30
 */
public class ConcreteClass extends AbstractClass {
    protected void doOperation1() {
        System.out.println("operation1 implements by child-class");
    }

    protected void doOperation2() {
        System.out.println("operation2 implements by child-class");
    }
}
