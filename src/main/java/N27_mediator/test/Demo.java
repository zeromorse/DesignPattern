package N27_mediator.test;

import N27_mediator.code.Colleague1;
import N27_mediator.code.Colleague2;
import N27_mediator.code.ConcreteMediator;

public class Demo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);

        mediator.colleagueChanged(colleague1);
    }
}
