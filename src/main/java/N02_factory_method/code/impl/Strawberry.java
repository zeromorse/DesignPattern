package N02_factory_method.code.impl;


import N02_factory_method.code.Fruit;

/**
 * 草莓
 *
 * @author Zero
 * @created 2017/4/17 23:13
 */
public class Strawberry implements Fruit {
    public void grow() {
        System.out.println("Strawberry is growing...");
    }

    public void harvest() {
        System.out.println("Strawberry has been harvested.");
    }

    public void plant() {
        System.out.println("Strawberry has been planted.");
    }
}
