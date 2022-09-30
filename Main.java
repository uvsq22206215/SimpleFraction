public class Main {
    public static void main(String[] args) {
        Fraction maFraction = new Fraction();
        System.out.println(maFraction);

        Fraction FT_1 = new Fraction(12, 9);

        // assert FT_1.getNumerateur() == 0 : "Le valeur du numérateur n'est pas 0";
        assert FT_1.toString() == "Je suis";
        assert args.length > 0;
    }
}
