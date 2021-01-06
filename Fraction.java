public class Fraction {
    private int num;
    private int den;
    private final int DEFAULT_DENOMINATOR = 2;
    private static int numberOfFractions = 0;
    

    public Fraction() {
        setNum( 1 );
        setDen( DEFAULT_DENOMINATOR );
        numberOfFractions++;
    }
    

    public Fraction( int num, int den ) {
        setNum( num );
        setDen( den );
        numberOfFractions++;
    }
    
    public static int getNumberOfFractions() {
        return numberOfFractions;
    }
    
    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int newNumerator) {
        num = newNumerator;
    }
    
    public void setDen(int newDenominator) {
        if (newDenominator == 0) {
            System.err.println( "Attempt to set denominator to 0 ignored, setting to 2 by default." );
            den = DEFAULT_DENOMINATOR;
        }
        else {
            den = newDenominator;
        }
    }
    
    public void invert() {
        if ( num == 0 ) {
            System.err.println( "Attempt to invert Fraction with 0 numerator, setting to 1 by default." );
            num = 1;
        }
        int temp = num;     
        num = den;          
        den = temp;         
    }

    private double magnitude() {
        return Math.abs( (double) num / den );
    }
    
    public boolean equals( Fraction other ) {
        return magnitude() == other.magnitude();
    }
    
    
    private int gcd( int a, int b ) {
        if ( b == 0 ) { 
            return a;
        }
        else {
            return gcd( b, a % b );  
        }
    }

    public void reduce() {
        int greatestCommonFactor = gcd( num, den );
        num = num / greatestCommonFactor;
        den = den / greatestCommonFactor;        
    }
        
    public Fraction add( Fraction other ) {
        int newNum =  num * other.getDen() + other.getNum() * den;
        int newDen =  den * other.getDen();
        // Create a new Fraction object for sum, reduce it, then return a reference to it
        Fraction sum = new Fraction( newNum, newDen );     
        sum.reduce();
        return sum; 
    }
    
    public static Fraction add( Fraction f1, Fraction f2 ) {
        int newNum =  f1.getNum() * f2.getDen() + f2.getNum() * f1.getDen();
        int newDen =  f1.getDen() * f2.getDen();
        Fraction sum = new Fraction( newNum, newDen );
        sum.reduce();
        return sum; 
    }
    
    public String toString() {
        return num + "/" + den;
    }
}
