package N21_chain_of_responsibility.code;

/**
 * 具体处理者
 *
 * @author Zero
 * @created 2017/5/24 21:24
 */
public class ConcreteHandler extends Handler {
    public void handleRequest() {
        if (successor != null) {
            System.out.println("The request is passed to " + successor);
            successor.handleRequest();
        } else {
            System.out.println("The request is handled here.");
        }
    }
}
