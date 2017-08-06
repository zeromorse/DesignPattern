package N26_interpreter.code.nonterminal;

import N26_interpreter.code.Context;
import N26_interpreter.code.Expression;

/**
 * 非终结符-或操作
 */
public class Or implements Expression {
    private Expression left;
    private Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Or) {
            return left.equals(((Or) obj).left) && right.equals(((Or) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return "( " + left + " OR " + right + " )";
    }
}
