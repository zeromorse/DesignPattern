package N12_proxy.code;

/**
 * 具体主题角色
 *
 * @author Zero
 * @created 2017/4/29 20:25
 */
public class RealSubject extends Subject{

    public void request() {
        System.out.println("from real subject.");
    }
}
