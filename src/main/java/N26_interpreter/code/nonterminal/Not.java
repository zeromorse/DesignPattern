package N26_interpreter.code.nonterminal;

import N26_interpreter.code.Context;
import N26_interpreter.code.Expression;


/**
 * 非终结符-非操作
 */
public class Not implements Expression {
    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Not) {
            return exp.equals(((Not) obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return "( NOT " + exp + " )";
    }
}
