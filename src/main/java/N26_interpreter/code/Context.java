package N26_interpreter.code;

import N26_interpreter.code.terminal.Variable;

import java.util.HashMap;
import java.util.Map;


/**
 * 上下文（全局变量）
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable var, boolean val) {
        map.put(var, val);
    }

    public boolean lookup(Variable var) {
        Boolean val = map.get(var);
        if (val == null) throw new IllegalArgumentException();
        return val;
    }
}
