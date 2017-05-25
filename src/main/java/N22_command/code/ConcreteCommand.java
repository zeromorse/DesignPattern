package N22_command.code;

/**
 * 具体命令类
 *
 * @author Zero
 * @created 2017/5/25 12:34
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
