package N17_strategy.test;

import N17_strategy.code.ConcreteStrategy2;
import N17_strategy.code.Context;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy2());
        context.contextInterface();
    }
}
