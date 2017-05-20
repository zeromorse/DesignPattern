package N02_factory_method.code.impl;

import N02_factory_method.code.Fruit;
import N02_factory_method.code.FruitGardener;

/**
 * 草莓园丁
 *
 * @author Zero
 * @created 2017/4/18 8:41
 */
public class StrawberryGardener implements FruitGardener {
    public Fruit factory() {
        return new Strawberry();
    }
}
