package N13_flyweight.code;

/**
 * 具体享元对象
 * 客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象
 *
 * @author Zero
 * @created 2017/4/29 20:50
 */
public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;

    // 内蕴状态，作为参量传入
    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }
    // 外蕴状态作为参量传入方法中，改变方法行为，但并不改变对象的内蕴状态
    public void operation(String state) {
        System.out.println("Intrinsic State = " + intrinsicState);
        System.out.println("Extrinsic state = " + state);
    }
}
