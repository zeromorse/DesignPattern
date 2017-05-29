package N25_visitor.code;

/**
 * 抽象节点角色
 *
 * @author Zero
 * @created 2017/5/29 11:42
 */
public interface Node {
    /**
     * 接受操作
     */
    void accept(Visitor visitor);
}
