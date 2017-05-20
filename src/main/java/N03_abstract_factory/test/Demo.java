package N03_abstract_factory.test;

import N03_abstract_factory.code.Fruit;
import N03_abstract_factory.code.Gardener;
import N03_abstract_factory.code.Veggie;
import N03_abstract_factory.code.impl.NorthernGardener;

/**
 * @author Zero
 * @created 2017/4/23 15:05
 */
public class Demo {
    public static void main(String[] args) {
        Gardener gardener = new NorthernGardener();
        Fruit fruit = gardener.createFruit();
        Veggie veggie = gardener.createVeggie();

        System.out.println(fruit.getClass().getSimpleName());
        System.out.println(veggie.getClass().getSimpleName());
    }
}
