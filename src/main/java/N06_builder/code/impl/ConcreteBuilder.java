package N06_builder.code.impl;

import N06_builder.code.Builder;
import N06_builder.code.Product;

/**
 * 具体建造者
 *
 * @author Zero
 * @created 2017/4/23 15:27
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public Builder buildPart1() {
        product.setPart1(new Object());
        return this;
    }

    public Builder buildPart2() {
        product.setPart2(new Object());
        return this;
    }

    public Builder buildPart3() {
        product.setPart3(new Object());
        return this;
    }

    public Builder buildPart4() {
        product.setPart4(new Object());
        return this;
    }

    public Product retrieveResult() {
        return product;
    }
}
