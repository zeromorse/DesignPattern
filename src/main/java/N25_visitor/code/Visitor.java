package N25_visitor.code;

import N25_visitor.code.impl.NodeA;
import N25_visitor.code.impl.NodeB;

/**
 * 抽象访问者对象
 *
 * @author Zero
 * @created 2017/5/29 11:42
 */
public interface Visitor {
    /**
     * 对应NodeA的访问操作
     */
    void visit(NodeA node);

    /**
     * 对应NodeB的访问操作
     */
    void visit(NodeB node);
}
