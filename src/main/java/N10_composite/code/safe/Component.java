package N10_composite.code.safe;

/**
 * 抽象构建角色（安全式）
 * 向Leaf靠拢
 *
 * @author Zero
 * @created 2017/4/24 11:40
 */
public interface Component {
    /**
     * 返还自己的实例
     */
    Composite getComposite();

    /**
     * 某个商业方法
     */
    void sampleOperation();
}
