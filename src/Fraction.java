/**
 * this program takes the numerator and the denominator and uses them to complete multiple tasks, like simplifying the fraction, multiplying, adding, deviding, subtracting and fixing negatives. then it outputs the numbers as a printed fraction.
 * @author Mark Hooks
 * @since Febuary 10th 2020
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * this part of the program takes the numerator and denominator, it also fixes the negatives so that if the denominator is negative and the numerator is positive, it switches the negatives. it also has a reduce method that reduces the fraction.
     * @param numerator this is the top part of the fraction
     * @param denominator this is the bottom part of the fraction
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        if (numerator >0 && denominator < 0 ){
            numerator *= -1;
            denominator *= -1;

        }else if(numerator<0 && denominator<0){
            denominator *= -1;
        }

        int m = numerator;
        int n = denominator;
        while (m % n != 0) {
            if(numerator<0){
                numerator *= -1;
            }
            if(denominator<0){
                denominator *= -1;
            }
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        numerator =m/numerator;
        denominator = n/denominator;
    }

    /**
     * this part of the code reduces the fraction to its simplest form.
     * @param numerator this takes the numerator
     * @param denominator this takes the denominator
     * @return this returns the most common number that both the numerator and denominator can be divided by
     */
    public static int reduce(int numerator, int denominator){
        int m = numerator;
        int n = denominator;
        while (m % n != 0) {
            if(numerator<0){
                numerator *= -1;
            }
            if(denominator<0){
                denominator *= -1;
            }
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }
    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * this part of the code multiplies two fractions and then simplifies said fraction
     * @param a this is the first fraction
     * @param b this is the second fraction
     * @return this returns the new numerator/denominator
     */
    public static Fraction multiply(Fraction a, Fraction b){

        int newnumer = a.numerator * b.numerator;
        int newdenom = a.denominator * b.denominator;
        if (newnumer >0 && newdenom < 0 ){
            newnumer = -newnumer;
            newdenom = -newdenom;

        }else if(newnumer<0 && newdenom<0){
            newdenom = -newdenom;
        }
        int num = reduce(newnumer, newdenom);
        newdenom/=num;
        newnumer/=num;
        return new Fraction(newnumer, newdenom);

    }

    /**
     * this part of the program divides two fractions and outputs them into its simplest from.
     * @param a this is the first fraction
     * @param b this is the second fraction
     * @return this returns the simplest form of the divided fraction
     */
    public static Fraction divide(Fraction a, Fraction b){
        int newnumer = a.numerator * b.denominator;
        int newdenom = b.numerator * a.denominator;
        if (newnumer >0 && newdenom < 0 ){
            newnumer = -newnumer;
            newdenom = -newdenom;

        }else if(newnumer<0 && newdenom<0){
            newdenom = -newdenom;
        }
        int num = reduce(newnumer, newdenom);
        newdenom/=num;
        newnumer/=num;
        return new Fraction(newnumer, newdenom);
    }

    /**
     * this part of the program adds the two fractions and reduces the final added fraction.
     * @param a this is the first fraction
     * @param b this is the second fraction
     * @return this returns the final added reduced fraction
     */
    public static Fraction add(Fraction a, Fraction b){
        int newdenom = a.denominator * b.denominator;
        int newnumer1 = a.numerator * b.denominator;
        int newnumer2 = b.numerator * a.denominator;
        int newnumer = newnumer1 +newnumer2;

        if (newnumer >0 && newdenom < 0 ){
            newnumer = -newnumer;
            newdenom = -newdenom;

        }else if(newnumer<0 && newdenom<0){
            newdenom = -newdenom;
        }
        int num = reduce(newnumer, newdenom);
        newdenom/=num;
        newnumer/=num;
        return new Fraction(newnumer, newdenom);
    }

    /**
     * this part of the program subtracts two fractions an reduces the final fraction
     * @param a this is the first fraction
     * @param b this is the second fraction
     * @return this returns the final reduced fraction
     */
    public static Fraction subtract(Fraction a,  Fraction b){

        int newdenom = a.denominator * b.denominator;
        int newnumer1 = a.numerator * b.denominator;
        int newnumer2 = b.numerator * a.denominator;
        int newnumer = newnumer1 -newnumer2;
        if (newnumer >0 && newdenom < 0 ){
            newnumer = -newnumer;
            newdenom = -newdenom;

        }else if(newnumer<0 && newdenom<0){
            newdenom = -newdenom;
        }
        int num = reduce(newnumer, newdenom);
        newdenom/=num;
        newnumer/=num;
        return new Fraction(newnumer, newdenom);
    }


    public String toString() {
        if (numerator >0 && denominator < 0 ){
            numerator = -numerator;
            denominator = -denominator;

        }else if(numerator<0 && denominator<0){
            denominator *= -1;
        }
        return numerator +"/" + denominator;
    }
}
