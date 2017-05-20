package N04_singleton.code;

/**
 * 饿汉式单例模式
 *
 * @author Zero
 * @created 2017/4/22 23:49
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
