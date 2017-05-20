package N02_factory_method.code.impl;


import N02_factory_method.code.Fruit;

/**
 * 苹果
 *
 * @author Zero
 * @created 2017/4/17 23:12
 */
public class Apple implements Fruit {
    private int treeAge;

    public void grow() {
        System.out.println("Apple is growing...");
    }

    public void harvest() {
        System.out.println("Apple has been harvested.");
    }

    public void plant() {
        System.out.println("Apple has been planted.");
    }

    //------------------------------------------------------------------------------treeAge属性方法
    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
