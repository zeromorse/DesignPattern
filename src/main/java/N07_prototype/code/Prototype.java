package N07_prototype.code;

/**
 * 抽象原型角色
 *
 * @author Zero
 * @created 2017/4/24 9:15
 */
public interface Prototype extends Cloneable {
    // 浅复制
    Object clone();

    // 深复制
    Object deepClone();
}
