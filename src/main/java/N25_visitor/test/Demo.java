package N25_visitor.test;

import N25_visitor.code.ObjectStructure;
import N25_visitor.code.Visitor;
import N25_visitor.code.impl.NodeA;
import N25_visitor.code.impl.NodeB;
import N25_visitor.code.impl.VisitorA;

/**
 * 客户端角色
 */
public class Demo {
    private static ObjectStructure objectStructure;
    private static Visitor visitor;

    public static void main(String[] args) {
        objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());
        visitor = new VisitorA();
        objectStructure.action(visitor);
    }
}
