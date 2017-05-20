package N13_flyweight.code.composite;

import N13_flyweight.code.Flyweight;

import java.util.HashMap;

/**
 * 具体复合享元角色
 *
 * @author Zero
 * @created 2017/4/29 21:28
 */
public class ConcreteCompositeFlyweight extends Flyweight{
    private HashMap<Character, Flyweight> fies = new HashMap<>();

    public ConcreteCompositeFlyweight() {
    }

    public void operation(String state) {
        for (Flyweight fly : fies.values()) {
            fly.operation(state);
        }
    }

    //------------------------------------------------------------------------------管理享元对象
    public void add(Character key, Flyweight value) {
        fies.put(key, value);
    }
}
