package N10_composite.code.safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 树枝构件角色
 *
 * @author Zero
 * @created 2017/4/29 19:46
 */
public class Composite implements Component {
    private List<Component> componentList = new ArrayList<>();

    public Composite getComposite() {
        return null;
    }

    public void sampleOperation() {
        Iterator<Component> iter = components();
        while (iter.hasNext()) iter.next().sampleOperation();
    }

    //------------------------------------------------------------------------------管理聚集对象
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
