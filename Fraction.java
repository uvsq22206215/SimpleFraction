public class Fraction {

    private int numerateur;
    private int denominateur;

    Fraction(int num_, int denom_){
        this.numerateur = num_;
        this.denominateur = denom_;
    }

    Fraction(int num_){
        this.numerateur = num_;
        this.denominateur = 1;
    }

    Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public String toString(){//overriding the toString() method
        return "Je suis une fraction.";
    }

    public int getNumerateur(){
        return this.numerateur;
    }

    public void setNumerateur(int newNum){
        this.numerateur = newNum;
    }

    public int getDenominateur(){
        return this.denominateur;
    }

    public void setDenominateur(int newDenom){
        this.denominateur = newDenom;
    }

    public double getFractionDoubleVal(){
        Number x = this.numerateur/this.denominateur;
        assert x.intValue() <= this.numerateur;
        return x.doubleValue();
    }

    public double addFractions(Fraction FT){
        double sumFraction = this.getFractionDoubleVal() + FT.getFractionDoubleVal();
        assert sumFraction > 0;
        return sumFraction;
    }

}
