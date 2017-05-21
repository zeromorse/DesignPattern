package N18_template_method.test;

import N18_template_method.code.AbstractClass;
import N18_template_method.code.ConcreteClass;

public class Demo {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
