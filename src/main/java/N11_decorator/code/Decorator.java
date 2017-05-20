package N11_decorator.code;

/**
 * 装饰角色
 *
 * @author Zero
 * @created 2017/4/29 20:14
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    /**
     * 商业方法，委派给构件
     */
    public void sampleOperation() {
        component.sampleOperation();
    }
}
