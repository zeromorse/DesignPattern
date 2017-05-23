package N20_iterator.code;

/**
 * 抽象聚集角色
 *
 * @author Zero
 * @created 2017/5/23 15:30
 */
public abstract class Aggregate<T> {

    public Iterator<T> createIterator() {
        return null;
    }
}
