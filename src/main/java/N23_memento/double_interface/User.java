package N23_memento.double_interface;

/**
 * 用户类
 *
 * @author Zero
 * @created 2017/5/26 17:07
 */
public class User {

    /**
     * 宽接口
     */
    class ConcreteClass implements Narrow {
        private void operation1() {
            System.out.println("ConcreteClass.operation1");
        }

        private void operation2() {
            System.out.println("ConcreteClass.operation2");
        }

        /**
         * 向外界提供成员类的实例
         * 保证只有User对象才可以调用ConcreteClass对象的私有方法，外界对象无法得到这个对象的内部消息。
         */
        public Narrow getConcreteClass() {
            return new ConcreteClass();
        }
    }
}
