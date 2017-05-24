package N16_immutable.test;

import N16_immutable.code.Fraction;

public class Demo {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = fraction1.multiply(new Fraction(2, 1));
        System.out.println(fraction1);
        System.out.println(fraction2);
    }
}
