package N05_multiton.code;

import java.util.Random;

/**
 * 骰子类 多例模式
 *
 * @author Zero
 * @created 2017/4/23 11:24
 */
public class Die {
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    // 私有构造子，保证外界无法实例化
    private Die() {
    }

    // 工厂方法
    public static Die getInstance(int whichOne) {
        if (whichOne == 1) return die1;
        else return die2;
    }

    // 掷骰子
    public synchronized int dice() {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(6) + 1;
    }
}
