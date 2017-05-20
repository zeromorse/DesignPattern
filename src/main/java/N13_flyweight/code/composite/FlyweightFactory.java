package N13_flyweight.code.composite;

import N13_flyweight.code.ConcreteFlyweight;
import N13_flyweight.code.Flyweight;

import java.util.HashMap;

/**
 * 享元工厂角色
 *
 * @author Zero
 * @created 2017/4/29 21:34
 */
public class FlyweightFactory {
    private HashMap<Character, Flyweight> fies = new HashMap<>();

    public FlyweightFactory() {
    }

    // 创建复合享元对象
    public Flyweight factory(String compositeString) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        for (char c : compositeString.toCharArray()) {
            compositeFly.add(c, factory(c));
        }
        return compositeFly;
    }

    // 创建方法 内置状态作为参量传入
    public Flyweight factory(Character state) {
        Flyweight flyweight;
        if (fies.containsKey(state)) {
            flyweight = fies.get(state);
        } else {
            flyweight = new ConcreteFlyweight(state);
            fies.put(state, flyweight);
        }
        return flyweight;
    }

    public void checkFlyweight() {
        int i = 1;
        System.out.println("----------------------------------------------------------------");
        for (Character c : fies.keySet()) {
            System.out.println("Item" + (i++) + " : " + c);
        }
        System.out.println("----------------------------------------------------------------");
    }

}
