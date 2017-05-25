package N22_command.code;

/**
 * 请求者代码
 *
 * @author Zero
 * @created 2017/5/25 12:36
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {
        command.execute();
    }
}
