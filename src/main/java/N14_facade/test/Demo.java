package N14_facade.test;

import N14_facade.code.SecurityFacade;

public class Demo {
    public static void main(String[] args) {
        SecurityFacade facade = new SecurityFacade();
        facade.activate();
        System.out.println("----------------------------------------------------------------");
        facade.deactivate();
    }
}
