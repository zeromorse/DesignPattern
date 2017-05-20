package N02_factory_method.code.impl;

import N02_factory_method.code.Fruit;
import N02_factory_method.code.FruitGardener;

/**
 * 苹果园丁
 *
 * @author Zero
 * @created 2017/4/18 8:37
 */
public class AppleGardener implements FruitGardener {
    public Fruit factory() {
        return new Apple();
    }
}
