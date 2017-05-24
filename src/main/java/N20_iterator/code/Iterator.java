package N20_iterator.code;

/**
 * 抽象迭代器
 *
 * @author Zero
 * @created 2017/5/23 15:31
 */
public interface Iterator<T> {
    /**
     * 返回至第一个对象
     */
    void first();

    /**
     * 移向下一个对象
     */
    void next();

    /**
     * 是否结束正向遍历
     */
    boolean isDone();

    /**
     * 返回当前元素
     */
    T currentItem();
}
