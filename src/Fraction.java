public class Fraction {
    private int numerator;
    private int denominator;
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
