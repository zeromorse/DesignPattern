package N27_mediator.code;

public class Colleague1 extends Colleague {

    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("This is an action form Colleague 1.");
    }
}
