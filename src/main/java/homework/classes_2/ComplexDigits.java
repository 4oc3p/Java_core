package homework.classes_2;


/**
 * Created by 4oc3p on 10.03.2017. Java_core
 */
public class ComplexDigits {
    private double realNumber;
    private double imaginaryNumber;

    public ComplexDigits(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    @Override
    public String toString() {
        return realNumber + "+" + imaginaryNumber + "i";
    }


    public String add(ComplexDigits otherComplex) {
        return (this.realNumber + otherComplex.realNumber) + " + " + (this.imaginaryNumber + otherComplex.imaginaryNumber) + "i";
    }

    public String subtract(ComplexDigits otherComplex) {
        return (this.realNumber - otherComplex.realNumber) + " + " + (this.imaginaryNumber - otherComplex.imaginaryNumber) + "i";
    }

    public static void main(String[] args) {
        ComplexDigits complex1 = new ComplexDigits(2.5, 3.2);
        ComplexDigits complex2 = new ComplexDigits(3.6, 1.7);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.subtract(complex2));
    }
}
