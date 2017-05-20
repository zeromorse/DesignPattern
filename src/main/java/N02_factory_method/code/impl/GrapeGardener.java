package N02_factory_method.code.impl;


import N02_factory_method.code.Fruit;
import N02_factory_method.code.FruitGardener;

/**
 * 葡萄园丁
 *
 * @author Zero
 * @created 2017/4/18 8:39
 */
public class GrapeGardener implements FruitGardener {
    public Fruit factory() {
        return (Fruit) new Grape();
    }
}
