package N10_composite.code.transparent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 树枝角色
 *
 * @author Zero
 * @created 2017/4/29 19:59
 */
public class Composite implements Component{
    private List<Component> componentList = new ArrayList<>();

    public Composite getComposite() {
        return null;
    }

    public void sampleOperation() {
        Iterator<Component> iter = components();
        while (iter.hasNext()) iter.next().sampleOperation();
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Iterator<Component> components() {
        return componentList.iterator();
    }
}
