package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Fruit;

/**
 * 亚热带水果
 *
 * @author Zero
 * @created 2017/4/18 8:48
 */
public class NorthernFruit implements Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
