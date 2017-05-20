package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Veggie;

/**
 * 热带蔬菜
 *
 * @author Zero
 * @created 2017/4/18 8:49
 */
public class TropicalVeggie implements Veggie {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
