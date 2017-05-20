package N10_composite.test;

import N10_composite.code.safe.Component;
import N10_composite.code.safe.Composite;
import N10_composite.code.safe.Leaf;

public class Demo {
    public static void main(String[] args) {
        Component component1 = new Composite();
        Component component2 = new Leaf();
        if (component1 instanceof Composite) {
            ((Composite) component1).add(component2);
        }
        component1.sampleOperation();
    }
}
