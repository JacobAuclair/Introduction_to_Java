// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70

import java.util.*;
// This is the main class that everything is run and called from
public class MainDir
{
    public static void main (String args[])
    {
        // These are the declarations of variables
        String divide;
        int frac1a,frac1b;
        int frac2a,frac2b;
        int frac3a,frac3b;
        // This creates the random number generator class that is used to generate the frations
        Random Rand = new Random();
        // Takes the numerator and denominator for each fraction and sets them to a random integer
        // between 1 and 10. no zeros on the denominator because that == infinity. 
        // This will then create a new Rational class using these variables as its integers
        frac1a = Rand.nextInt(9)+1;
        frac1b = Rand.nextInt(frac1a)+1;
        Rational fraction1 = new Rational(frac1a,frac1b);
        // The same as the first fraction creator
        frac2a = Rand.nextInt(9)+1;
        frac2b = Rand.nextInt(frac2a)+1;
        Rational fraction2 = new Rational(frac2a,frac2b);
        // And same as the last
        frac3a = Rand.nextInt(9)+1;
        frac3b = Rand.nextInt(frac3a)+1;
        Rational fraction3 = new Rational(frac3a,frac3b);
        // This outputs the initail fractions in the window before any calculations are done
        System.out.println("Rational Numbers: "+frac1a+"/"+frac1b+" , "+frac2a+"/"+frac2b+" , "+frac3a+"/"+frac1b);
        // This uses the max method from the first Rational fraction class and compares it to the 
        // next one, and the outcome of that gets compared to the third
        Rational max = fraction1.max(fraction2.max(fraction3));
        System.out.println("Maximum: "+max+" ("+max.value()+")");
        // This is the same as the maximum comparison however it is made to find the minimum
        Rational min = fraction1.min(fraction2.min(fraction3));
        System.out.println("Minimum: "+min+" ("+min.value()+")");
        // this will add all of the fractions together however you must use the .reduce() so that
        // you can reduce it to its simplest fraction due to the use of multiplication in the
        // denominator
        Rational sum = fraction1.sum(fraction2.sum(fraction3));
        sum.reduce();
        System.out.println("Sum: "+sum+" ("+sum.value()+")");
        // The average acts the same as does the sum however it calculates something else.
        Rational average = sum.divide(new Rational (3,1));
        average.reduce();
        System.out.println("Average: "+average+" ("+average.value()+")");

    }
}
