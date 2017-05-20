package N04_singleton.test;

import N04_singleton.code.LazySingleton;

/**
 * @author Zero
 * @created 2017/4/23 15:04
 */
public class Demo {
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance1 = LazySingleton.getInstance();

        System.out.println("instance == instance1 : " + (instance == instance1));
    }
}
