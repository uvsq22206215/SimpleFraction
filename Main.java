

public class Main {

    public static final Fraction fraction_zero = new Fraction(0,1);
    public static final Fraction fraction_un = new Fraction(1,1);

    public static void main(String[] args) {
        Fraction FT_1 = new Fraction();
        System.out.println(FT_1);

        Fraction FT_2 = new Fraction(12, 9);

        // assert FT_1.getNumerateur() == 0 : "Le valeur du numérateur n'est pas 0";
        // assert FT_1.toString() == "Je suis";

        System.out.println(FT_1.equals(FT_2));

        assert FT_1.compareTo(FT_2) == -1;
        System.out.println(FT_1.compareTo(FT_2));

        // Testing the Number class inheritance
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;

    }
}
