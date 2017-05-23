package N20_iterator.code;

/**
 * 抽象迭代器
 *
 * @author Zero
 * @created 2017/5/23 15:31
 */
public interface Iterator<T> {
    void first();

    void next();

    boolean isDone();

    T currentItem();
}
