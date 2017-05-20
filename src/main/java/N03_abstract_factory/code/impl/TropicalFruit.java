package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Fruit;

/**
 * 热带水果
 *
 * @author Zero
 * @created 2017/4/18 8:47
 */
public class TropicalFruit implements Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
