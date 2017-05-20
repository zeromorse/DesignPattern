package N07_prototype.test;

import N07_prototype.code.Prototype;
import N07_prototype.code.impl.ConcretePrototype;

public class Demo {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Object prototype1 = prototype.clone();
        Object prototype2 = prototype.deepClone();
        System.out.println(prototype);
        System.out.println(prototype1);
        System.out.println(prototype2);
    }
}
