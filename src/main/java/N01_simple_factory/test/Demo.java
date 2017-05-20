package N01_simple_factory.test;

import N01_simple_factory.code.BadFruitException;
import N01_simple_factory.code.Fruit;
import N01_simple_factory.code.FruitGardener;

/**
 * 测试类
 *
 * @author Zero
 * @created 2017/4/23 13:03
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Fruit apple = FruitGardener.factory("apple");
            apple.plant();
            apple.grow();
            apple.harvest();
        } catch (BadFruitException e) {
            e.printStackTrace();
        }

    }
}
