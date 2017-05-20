package N01_simple_factory.code.impl;

import N01_simple_factory.code.Fruit;

/**
 * 葡萄
 *
 * @author Zero
 * @created 2017/4/17 23:08
 */
public class Grape implements Fruit {
    private boolean seedless;

    public void grow() {
        System.out.println("Grape is growing...");
    }

    public void harvest() {
        System.out.println("Grape has been harvested.");
    }

    public void plant() {
        System.out.println("Grape has been planted.");
    }

    //------------------------------------------------------------------------------seedless的属性方法
    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
