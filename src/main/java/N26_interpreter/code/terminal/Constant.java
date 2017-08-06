package N26_interpreter.code.terminal;

import N26_interpreter.code.Context;
import N26_interpreter.code.Expression;

/**
 * 终结符-常量角色
 */
public class Constant implements Expression {
    private boolean val;

    public Constant(boolean val) {
        this.val = val;
    }

    public boolean interpret(Context ctx) {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Constant) {
            return val == ((Constant) obj).val;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return Boolean.valueOf(val).toString();
    }
}
