package N11_decorator.test;

import N11_decorator.code.Component;
import N11_decorator.code.ConcreteDecorator;

public class Demo {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator();
        component.sampleOperation();
    }
}
