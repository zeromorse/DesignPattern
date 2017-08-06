package N26_interpreter.test;

import N26_interpreter.code.Context;
import N26_interpreter.code.Expression;
import N26_interpreter.code.nonterminal.And;
import N26_interpreter.code.nonterminal.Not;
import N26_interpreter.code.nonterminal.Or;
import N26_interpreter.code.terminal.Constant;
import N26_interpreter.code.terminal.Variable;

/**
 * 客户端实现类（Client）
 */
public class Demo {
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x = " + x.interpret(ctx));
        System.out.println("y = " + y.interpret(ctx));
        System.out.println(exp.toString() + " = " + exp.interpret(ctx));
    }
}
