package N02_factory_method.test;

import N02_factory_method.code.Fruit;
import N02_factory_method.code.FruitGardener;
import N02_factory_method.code.impl.StrawberryGardener;

/**
 * @author Zero
 * @created 2017/4/23 13:12
 */
public class Demo {
    public static void main(String[] args) {
        FruitGardener gardener = new StrawberryGardener();

        Fruit fruit = gardener.factory();
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
