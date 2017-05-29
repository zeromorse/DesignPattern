package N25_visitor.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象
 *
 * @author Zero
 * @created 2017/5/29 12:03
 */
public class ObjectStructure {
    private List<Node> nodeList;

    public ObjectStructure() {
        this.nodeList = new ArrayList<>();
    }

    /**
     * 执行访问操作
     */
    public void action(Visitor visitor) {
        for (Node n : nodeList) {
            n.accept(visitor);
        }
    }

    /**
     * 增加一个元素
     */
    public void add(Node node) {
        nodeList.add(node);
    }
}
