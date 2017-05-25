package N22_command.test;

import N22_command.code.Command;
import N22_command.code.ConcreteCommand;
import N22_command.code.Invoker;
import N22_command.code.Receiver;

public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
