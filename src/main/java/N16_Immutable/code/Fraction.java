package N16_Immutable.code;

/**
 * 分数(假分数)
 * 使用不变模式
 */
public final class Fraction {
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);

    private int numerator; // 分子
    private int denominator; // 分母

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("分数的分母不能为零！");
        }

        this.numerator = numerator;
        this.denominator = denominator;

        normalizeSignWithSimplify();
    }

    // 内部 Fraction的创建采用快速初始化（不变模式）
    private Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    // 求最大公约数
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    /**
     * 除法
     *
     * @param fraction 另一个分数
     * @return this 或 ZERO
     */
    public Fraction divide(Fraction fraction) {
        checkNull(fraction);

        if (fraction.numerator == 0) {
            throw new IllegalArgumentException("除数不能为零！");
        }

        // this的numerator为0，返回ZERO
        if (numerator == 0) {
            return ZERO;
        }

        // 执行除法运算
        Fraction _fraction = new Fraction(this);
        _fraction.numerator *= fraction.denominator;
        _fraction.denominator *= fraction.numerator;
        _fraction.normalizeSignWithSimplify();
        return _fraction;
    }

    /**
     * 乘法
     *
     * @param fraction 另一个分数
     * @return this 或 ZERO
     */
    public Fraction multiply(Fraction fraction) {
        checkNull(fraction);

        // this和fraction的numerator值为0
        if (fraction.numerator == 0 || numerator == 0) {
            return ZERO;
        }

        Fraction _fraction = new Fraction(this);
        // 执行乘法运算
        _fraction.numerator *= fraction.numerator;
        _fraction.denominator *= fraction.denominator;
        _fraction.normalizeSignWithSimplify();

        return _fraction;
    }

    // 另一个分数为null，抛出异常
    private void checkNull(Fraction fraction) {
        if (fraction == null) throw new IllegalArgumentException("参数不能为null");
    }

    /**
     * 简化（约分）
     */
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        if (gcd == 1) return;
        numerator /= gcd;
        denominator /= gcd;
    }

    /**
     * 规范化符号：
     * 符号放在分子上
     */
    private void normalizeSign() {
        if (((numerator >>> 31) ^ (denominator >>> 31)) == 0) {
            numerator = Math.abs(numerator);
        } else {
            numerator = -Math.abs(numerator);
        }
        denominator = Math.abs(denominator);
    }

    /**
     * 规范化符号和简化
     */
    private void normalizeSignWithSimplify() {
        normalizeSign();
        simplify();
    }

    /**
     * 减法
     *
     * @param fraction 另一个分数
     * @return this，ZERO 或 参数的一个副本
     */
    public Fraction minus(Fraction fraction) {
        checkNull(fraction);

        if (fraction.numerator == 0) return this;

        Fraction _fraction = new Fraction(fraction);
        _fraction.numerator = -_fraction.numerator;
        return commonAdd(_fraction);
    }

    /**
     * 加法
     *
     * @param fraction 另一个分数
     * @return this，ZERO 或 参数的一个副本
     */
    public Fraction add(Fraction fraction) {
        checkNull(fraction);

        if (fraction.numerator == 0) return this;

        Fraction _fraction = new Fraction(fraction);
        return commonAdd(_fraction);
    }

    /**
     * 用于加法和减法的通用实现
     *
     * @param fraction 经过检验(不为ZERO不为null)的分数副本
     * @return this
     */
    private Fraction commonAdd(Fraction fraction) {
        // 应对this为ZERO
        if (numerator == 0) return fraction;

        if (fraction.denominator == this.denominator) {
            fraction.numerator += this.numerator;

            if (fraction.numerator == 0) return ZERO;
        } else {
            int lcm = lcm(denominator, fraction.denominator);
            int numerator1 = (lcm / denominator) * numerator;
            int numerator2 = (lcm / fraction.denominator) * fraction.numerator;
            fraction.denominator = lcm;
            fraction.numerator = numerator1 + numerator2;

            if (fraction.numerator == 0) return ZERO;
        }
        fraction.simplify();

        return fraction;
    }

    /**
     * 求最小公倍数
     *
     * @param a 数字a
     * @param b 数字b
     * @return 最小公倍数
     */
    private int lcm(int a, int b) {
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        int lcm = big;
        while (lcm % small != 0) {
            lcm += big;
        }
        return lcm;
    }

    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        return numerator == fraction.numerator
                       && denominator == fraction.denominator;
    }

    public String toString() {
        if (numerator == 0) return "0";
        if (numerator == 1 && denominator == 1) return "1";

        return numerator + "/" + denominator;
    }
}
