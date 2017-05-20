package N06_builder.test;

import N06_builder.code.Product;
import N06_builder.code.impl.ConcreteBuilder;

public class Demo {
    public static void main(String[] args) {
        Product product;
        ConcreteBuilder builder = new ConcreteBuilder();

        product = builder.retrieveResult();
        System.out.println("before building part : " + product);

        product = builder.buildPart1().buildPart2().buildPart4().retrieveResult();
        System.out.println("after building part : " + product);
    }
}
