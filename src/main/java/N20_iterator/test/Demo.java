package N20_iterator.test;

import N20_iterator.code.Aggregate;
import N20_iterator.code.ConcreteAggregate;
import N20_iterator.code.Iterator;

/**
 * 迭代器模式样例
 */
public class Demo {
    public static void main(String[] args) {
        Aggregate<String> agg = ConcreteAggregate.of("A", "B", "C", "D", "E");
        Iterator<String> iter = agg.createIterator();
        while (!iter.isDone()) {
            System.out.println(iter.currentItem());
            iter.next();
        }
    }
}
