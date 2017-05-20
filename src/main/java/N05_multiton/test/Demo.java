package N05_multiton.test;

import N05_multiton.code.Die;

/**
 * @author Zero
 * @created 2017/4/23 14:59
 */
public class Demo {
    public static void main(String[] args) {
        Die die1 = Die.getInstance(1);
        Die die2 = Die.getInstance(2);
        Die anotherDie1 = Die.getInstance(1);

        System.out.println("die1.dice : " + die1.dice());
        System.out.println("die2.dice : " + die2.dice());
        System.out.println("die1 == anotherDie1 : " + (die1 == anotherDie1));
    }
}
