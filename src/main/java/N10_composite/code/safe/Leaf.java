package N10_composite.code.safe;

/**
 * 树叶构件角色
 *
 * @author Zero
 * @created 2017/4/29 19:54
 */
public class Leaf implements Component {
    public Composite getComposite() {
        return null;
    }

    public void sampleOperation() {
        System.out.println("I am Leaf.");
    }
}