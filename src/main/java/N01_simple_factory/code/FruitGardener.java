package N01_simple_factory.code;

import N01_simple_factory.code.impl.Apple;
import N01_simple_factory.code.impl.Grape;
import N01_simple_factory.code.impl.Strawberry;

/**
 * 园丁（简单工厂）
 *
 * @author Zero
 * @created 2017/4/18 8:21
 */
public class FruitGardener {
    public static Fruit factory(String which) throws BadFruitException {
        Fruit res;
        switch (which) {
            case "apple" : res = new Apple();break;
            case "grape" : res = new Grape();break;
            case "strawberry" : res = new Strawberry();break;
            default:throw new BadFruitException("Bad fruit request!");
        }
        return res;
    }
}
