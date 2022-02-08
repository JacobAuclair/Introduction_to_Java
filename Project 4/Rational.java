// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70

import java.util.*;
// This is the Rational class and represents each of the three random variables
class Rational {
    // the numerator and denominator of the variable this class represents
    // they are private so that to keep the program secure
    private int numerator;
    private int denominator;
    // This Rational method is used when passing variables to the numerator and denominator above
    public Rational (int a, int b) 
    {
        numerator = a; 
        denominator = b;
    }
    // Rational max takes the input of another Rational fration class and compares it with
    // the current values from this class to determine which is bigger.
    public Rational max (Rational r) 
    {
        if ((double)numerator / denominator > (double)(r.getNumerator()) / r.getDenominator())
        {
            return r;
        }
        else {return new Rational (numerator, denominator);}
    }
    // does the same logical process as max above however it determines the lowest fraction
    public Rational min (Rational r) 
    {
        if ((double)numerator / denominator < (double)(r.getNumerator()) / r.getDenominator())
        {
            return r;
        }
        else{return new Rational (numerator, denominator);}
    }
    // This adds two fractions together. R and the current class values
    public Rational sum (Rational r) 
    {
        int num, den;
        den = denominator * r.getDenominator();
        num = numerator * r.getDenominator() + r.getNumerator() * denominator;
        return new Rational (num, den);
    }
    // this is the same as sum however it divides the two fractions.
    public Rational divide (Rational r) 
    {
        int num, den;
        den = denominator * r.getNumerator();
        num = numerator * r.getDenominator();
        return new Rational (num, den);
    }
    // The two gets here allow for this class to access and return other numerator and denominator
    // values in other instances of this class
    public int getNumerator() { 
        return numerator; 
    }
    public int getDenominator() { 
        return denominator; 
    }
    // This returnes the floating point value of the fraction by casting the two ints as doubles
    public double value(){
        return (double) numerator / denominator;
    }
    // This will return the numerator and denominator in a string format for string printing
    public String toString () { 
        return numerator + "/" + denominator; 
    }
    // reduce takes the gcd method below it and takes any fraction put into it and reduces it 
    // down to its simplest form to be displayed
    public void reduce() {

        int factor;
        factor = gcd(numerator, denominator);
        numerator = numerator / factor;
        denominator = denominator / factor;
    }
    // This gcd is used in the above method to reduce denominators of a fraction
    private int gcd (int x, int y) {

        int t;
        while (y>0) {
            t = x % y;
            x = y;
            y = t;
        }
        return x;
    }
}
