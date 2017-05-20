package N03_abstract_factory.code.impl;

import N03_abstract_factory.code.Veggie;

/**
 * 亚热带蔬菜
 *
 * @author Zero
 * @created 2017/4/18 8:50
 */
public class NorthernVeggie implements Veggie {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
