package N25_visitor.code.impl;

import N25_visitor.code.Visitor;

/**
 * 具体访问者2
 *
 * @author Zero
 * @created 2017/5/29 11:44
 */
public class VisitorB implements Visitor{
    public void visit(NodeA node) {
        System.out.println("I am VisitorB");
        System.out.println(node.operationA());
    }

    public void visit(NodeB node) {
        System.out.println("I am VisitorB");
        System.out.println(node.operationB());
    }
}
