package N11_decorator.code;

/**
 * 具体装饰角色
 *
 * @author Zero
 * @created 2017/4/29 20:14
 */
public class ConcreteDecorator extends Decorator {
    // 商业方法
    public void sampleOperation() {
        System.out.println("this is concrete decorator.");
    }
}
