package N12_proxy.test;

import N12_proxy.code.ProxySubject;
import N12_proxy.code.Subject;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }
}
