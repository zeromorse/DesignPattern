package N06_builder.code;

/**
 * 产品类
 *
 * @author Zero
 * @created 2017/4/23 15:28
 */
public class Product {
    private Object part1;
    private Object part2;
    private Object part3;
    private Object part4;

    public Product() {
    }

    public Object getPart1() {
        return part1;
    }

    public void setPart1(Object part1) {
        this.part1 = part1;
    }

    public Object getPart2() {
        return part2;
    }

    public void setPart2(Object part2) {
        this.part2 = part2;
    }

    public Object getPart3() {
        return part3;
    }

    public void setPart3(Object part3) {
        this.part3 = part3;
    }

    public Object getPart4() {
        return part4;
    }

    public void setPart4(Object part4) {
        this.part4 = part4;
    }

    public String toString() {
        return "Product{" +
                       "part1=" + part1 +
                       ", part2=" + part2 +
                       ", part3=" + part3 +
                       ", part4=" + part4 +
                       '}';
    }
}
