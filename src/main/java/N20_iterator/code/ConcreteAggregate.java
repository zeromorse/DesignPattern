package N20_iterator.code;

/**
 * 具体聚集对象
 *
 * @author Zero
 * @created 2017/5/23 15:40
 */
public class ConcreteAggregate extends Aggregate<String> {
    private String[] strs = {"Monk Tang", "Monkey", "Pigsy", "Sandy", "Horse"};

    public Iterator<String> createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器角色
     *
     * @author Zero
     * @created 2017/5/23 15:42
     */
    private class ConcreteIterator implements Iterator<String> {
        private int index = 0;

        public void first() {
            index = 0;
        }

        public void next() {
            if (index < strs.length) index++;
        }

        public boolean isDone() {
            return index >= strs.length;
        }

        public String currentItem() {
            return strs[index];
        }
    }
}
