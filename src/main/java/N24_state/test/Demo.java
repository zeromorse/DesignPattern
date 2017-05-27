package N24_state.test;

import N24_state.code.ConcreteState;
import N24_state.code.Context;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState());
        context.sampleOperation();
    }
}
