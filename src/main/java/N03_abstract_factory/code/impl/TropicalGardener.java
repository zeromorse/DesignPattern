package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Fruit;
import N03_abstract_factory.code.Gardener;
import N03_abstract_factory.code.Veggie;

/**
 * 热带大棚区园丁
 *
 * @author Zero
 * @created 2017/4/18 8:52
 */
public class TropicalGardener implements Gardener {
    public Fruit createFruit() {
        return new TropicalFruit();
    }

    public Veggie createVeggie() {
        return new TropicalVeggie();
    }
}
