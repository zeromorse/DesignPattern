package N12_proxy.code;

/**
 * 代理主题角色
 *
 * @author Zero
 * @created 2017/4/29 20:27
 */
public class ProxySubject extends Subject {
    private RealSubject subject;

    public void request() {
        preRequest();
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("after request (made in proxy).");
    }

    private void preRequest() {
        System.out.println("before request (made in proxy).");
    }
}
