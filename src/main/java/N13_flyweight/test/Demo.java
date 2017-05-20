package N13_flyweight.test;

import N13_flyweight.code.Flyweight;
import N13_flyweight.code.composite.FlyweightFactory;

public class Demo {
    public static void main(String[] args) {
        //FlyweightFactory factory = new FlyweightFactory();
        //Flyweight fly1 = factory.factory('a');
        //fly1.operation("First Call");
        //Flyweight fly2 = factory.factory('b');
        //fly2.operation("Second Call");
        //Flyweight fly3 = factory.factory('a');
        //fly3.operation("Third Call");
        //
        //factory.checkFlyweight();

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory("aba");
        fly.operation("Composite Call");
        factory.checkFlyweight();
    }
}
