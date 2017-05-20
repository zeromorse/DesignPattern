package N13_flyweight.code.simple;

import N13_flyweight.code.ConcreteFlyweight;
import N13_flyweight.code.Flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 *
 * @author Zero
 * @created 2017/4/29 20:50
 */
public class FlyweightFactory {
    private HashMap<Character, Flyweight> fies = new HashMap<>();

    public FlyweightFactory() {
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