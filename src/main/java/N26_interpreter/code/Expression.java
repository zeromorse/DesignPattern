package N26_interpreter.code;

/**
 * 表达式角色
 */
public interface Expression {
    boolean interpret(Context ctx);

    boolean equals(Object obj);

    int hashCode();

    String toString();
}
