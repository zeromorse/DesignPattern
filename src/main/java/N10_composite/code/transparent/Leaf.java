package N10_composite.code.transparent;

import java.util.Iterator;

/**
 * 树叶角色
 *
 * @author Zero
 * @created 2017/4/29 20:04
 */
public class Leaf implements Component {
    public Composite getComposite() {
        return null;
    }

    public void sampleOperation() {
        System.out.println("I am Leaf too.");
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Iterator<Component> components() {
        throw new UnsupportedOperationException();
    }
}
