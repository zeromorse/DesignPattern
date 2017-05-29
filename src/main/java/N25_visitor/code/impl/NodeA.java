package N25_visitor.code.impl;

import N25_visitor.code.Node;
import N25_visitor.code.Visitor;

/**
 * 具体节点角色1
 *
 * @author Zero
 * @created 2017/5/29 11:42
 */
public class NodeA implements Node {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 特有的商业方法
     */
    public String operationA() {
        return "NodeA is visited.";
    }
}
