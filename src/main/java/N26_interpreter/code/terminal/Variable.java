package N26_interpreter.code.terminal;

import N26_interpreter.code.Context;
import N26_interpreter.code.Expression;

/**
 * 终结符-变量角色
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Variable) {
            return name.equals(((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
