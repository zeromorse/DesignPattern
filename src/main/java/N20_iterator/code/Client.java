package N20_iterator.code;

/**
 * 客户角色
 *
 * @author Zero
 * @created 2017/5/23 15:47
 */
public class Client {
    private Iterator<String> it;
    private Aggregate<String> agg = new ConcreteAggregate();

    public void operation() {
        it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
