package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Fruit;
import N03_abstract_factory.code.Gardener;
import N03_abstract_factory.code.Veggie;

/**
 * 亚热带大棚区园丁
 *
 * @author Zero
 * @created 2017/4/18 8:52
 */
public class NorthernGardener implements Gardener {
    public Fruit createFruit() {
        return new NorthernFruit();
    }

    public Veggie createVeggie() {
        return new NorthernVeggie();
    }
}
