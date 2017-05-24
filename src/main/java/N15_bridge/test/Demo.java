package N15_bridge.test;

import N15_bridge.code.Abstraction;
import N15_bridge.code.ConcreteImplementorA;
import N15_bridge.code.Implementor;
import N15_bridge.code.RefinedAbstraction;

public class Demo {
    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(impl);
        abstraction.operation();
    }
}
