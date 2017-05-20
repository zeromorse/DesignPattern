package N06_builder.code;

/**
 * 抽象建造者
 *
 * @author Zero
 * @created 2017/4/23 15:26
 */
public interface Builder {
    Builder buildPart1();
    Builder buildPart2();
    Builder buildPart3();
    Builder buildPart4();

    Product retrieveResult();
}
