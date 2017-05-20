package N10_composite.code.transparent;

import java.util.Iterator;

/**
 * 抽象构建角色（透明式）
 * 向Composite靠拢
 *
 * @author Zero
 * @created 2017/4/24 11:40
 */
public interface Component {
    /**
     * 返还自己是实例
     */
    Composite getComposite();

    /**
     * 某个商业方法
     */
    void sampleOperation();

    //------------------------------------------------------------------------------管理聚集对象

    void add(Component component);

    void remove(Component component);

    Iterator<Component> components();
}
