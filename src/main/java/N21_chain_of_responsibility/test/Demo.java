package N21_chain_of_responsibility.test;

import N21_chain_of_responsibility.code.ConcreteHandler;
import N21_chain_of_responsibility.code.Handler;

public class Demo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
