package N20_iterator.code;

/**
 * 具体聚集对象
 *
 * @author Zero
 * @created 2017/5/23 15:40
 */
public class ConcreteAggregate<T> extends Aggregate<T> {

    @SafeVarargs
    public static <T> Aggregate<T> of(T... objs) {
        return new ConcreteAggregate<>(objs);
    }

    private ConcreteAggregate(T[] objs) {
        this.objs = objs;
    }

    private T[] objs;

    public Iterator<T> createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器角色
     *
     * @author Zero
     * @created 2017/5/23 15:42
     */
    private class ConcreteIterator implements Iterator<T> {
        private int index = 0;

        public void first() {
            index = 0;
        }

        public void next() {
            if (index < objs.length) index++;
        }

        public boolean isDone() {
            return index >= objs.length;
        }

        public T currentItem() {
            return objs[index];
        }
    }
}
