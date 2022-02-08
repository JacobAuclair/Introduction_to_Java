
// Name: Jacob Auclair
// Email: jacobauclair@my.ccsu.edu
// Class: CS 151
// Section: 70

import java.io.*;
import java.util.*;
// class numbers is the Main class the program runs from
public class Numbers
{
    public static void main(String[] args)
    {
        // this long declaration of different variables is used throughout the entire program
        int inputint = 0;
        String inputstring = ("null");
        int n;
        int abu;
        int abuhold;
        int abuadd;
        int abuoutput;
        int defoutput;
        int peroutput;
        int prioutput;
        int primedetect = 1;
        int div;
        int count;
        boolean check;
        // this scanner is used for user input reading
        Scanner scan = new Scanner(System.in);
        // intital instructions for the user input
        System.out.println("Please enter a condition type.");
        System.out.println("The condition options are: Limit, Abundand, Deficient, Perfect, and Prime.");
        System.out.println("*Input is case sensitive*");
        // i know these try/catches arent technically taught however i just cant bring myself to take them
        // out because what if someone where to enter the wrong thing and then your code dump is there to
        // be tampered with however the user pleases. i know, unreasonable for this application but still,
        // practice none the less. 
        try{
            inputstring = scan.nextLine();
        }
        catch (Exception e){
            System.out.println("Incorrect input, program terminating");
            System.exit(1);
        }
        System.out.println("Please enter positive integer that will be associated with your condition.");
        try{
            inputint = scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Incorrect input, program terminating");
            System.exit(1);
        }
        // Prints out the start of the table
        System.out.println("N | Abundand | Deficient | Perfect | Prime");
        if (inputstring.equals ("Limit")){
            // sets values to zero for each of the integers going to be used in the if statement
            abuoutput = 0;
            defoutput = 0;
            peroutput = 0;
            prioutput = 0;
            // this is the loop for the number of times each row of the table is to be completed
            for (n = 1; n <= inputint; n++){
                // varibales used in the calculations to determine the number type
                abu = n;
                div = 1;
                abuadd = 0;
                // this is the loop that will check each type with remainders and abundants and will
                // increment abundant if need be
                while( div < n ){
                    check = Type.isInteger(Integer.toString(abu%div));
                    if (check == true){
                        abuhold = abu%div;
                        if (abuhold == 0){
                            abuadd = div + abuadd;

                        }
                    }
                    div++;
                }
                // table's row isnt printed just yet, this is what increment the rest of the number types
                // they can all be determined by what the abundand number remainder is
                if (abuadd > n){
                    abuoutput++;
                }
                if (abuadd < n){
                    defoutput++;
                }
                if (abuadd == n){
                    peroutput++;
                }
                if (abuadd == primedetect){
                    prioutput++;
                }
                // this is finally where the output of the numbers for this row is before it loops 
                // back and completes the next row. This is the same for the next couple types. The same 
                // exact code except for the variable that determines when it stops
                System.out.println(n+" |     "+abuoutput+" |     "+defoutput+" |     "+peroutput+" |     "+prioutput);
            }
        }
        else if (inputstring.equals ("Abundand")){

            abuoutput = 0;
            defoutput = 0;
            peroutput = 0;
            prioutput = 0;
            for (n = 1; abuoutput <= inputint; n++){
                abu = n;
                div = 1;
                abuadd = 0;

                while( div < n ){

                    check = Type.isInteger(Integer.toString(abu%div));
                    if (check == true){
                        abuhold = abu%div;
                        if (abuhold == 0){
                            abuadd = div + abuadd;

                        }
                    }
                    div++;
                }

                if (abuadd > n){
                    abuoutput++;
                }
                if (abuadd < n){
                    defoutput++;
                }
                if (abuadd == n){
                    peroutput++;
                }
                if (abuadd == primedetect){
                    prioutput++;
                }

                System.out.println(n+" |     "+abuoutput+" |     "+defoutput+" |     "+peroutput+" |     "+prioutput);

                if (abuoutput == inputint){
                    break;
                }
            }
        }
        else if (inputstring.equals ("Deficient")){

            abuoutput = 0;
            defoutput = 0;
            peroutput = 0;
            prioutput = 0;
            for (n = 1; abuoutput <= inputint; n++){
                abu = n;
                div = 1;
                abuadd = 0;

                while( div < n ){
                    check = Type.isInteger(Integer.toString(abu%div));
                    if (check == true){
                        abuhold = abu%div;
                        if (abuhold == 0){
                            abuadd = div + abuadd;

                        }
                    }
                    div++;
                }

                if (abuadd > n){
                    abuoutput++;
                }
                if (abuadd < n){
                    defoutput++;
                }
                if (abuadd == n){
                    peroutput++;
                }
                if (abuadd == primedetect){
                    prioutput++;
                }

                System.out.println(n+" |     "+abuoutput+" |     "+defoutput+" |     "+peroutput+" |     "+prioutput);

                if (defoutput == inputint){
                    break;
                }
            }
        }
        else if (inputstring.equals ("Perfect")){

            abuoutput = 0;
            defoutput = 0;
            peroutput = 0;
            prioutput = 0;
            for (n = 1; abuoutput <= inputint; n++){
                abu = n;
                div = 1;
                abuadd = 0;

                while( div < n ){
                    check = Type.isInteger(Integer.toString(abu%div));
                    if (check == true){
                        abuhold = abu%div;
                        if (abuhold == 0){
                            abuadd = div + abuadd;

                        }
                    }
                    div++;
                }
                if (abuadd > n){
                    abuoutput++;
                }
                if (abuadd < n){
                    defoutput++;
                }
                if (abuadd == n){
                    peroutput++;
                }
                if (abuadd == primedetect){
                    prioutput++;
                }

                System.out.println(n+" |     "+abuoutput+" |     "+defoutput+" |     "+peroutput+" |     "+prioutput);

                if (peroutput == inputint){
                    break;
                }
            }
        }
        else if (inputstring.equals ("Prime")){

            abuoutput = 0;
            defoutput = 0;
            peroutput = 0;
            prioutput = 0;
            for (n = 1; abuoutput <= inputint; n++){
                abu = n;
                div = 1;
                abuadd = 0;

                while( div < n ){
                    check = Type.isInteger(Integer.toString(abu%div));
                    if (check == true){
                        abuhold = abu%div;
                        if (abuhold == 0){
                            abuadd = div + abuadd;

                        }
                    }
                    div++;
                }

                if (abuadd > n){
                    abuoutput++;
                }
                if (abuadd < n){
                    defoutput++;
                }
                if (abuadd == n){
                    peroutput++;
                }
                if (abuadd == primedetect){
                    prioutput++;
                }

                System.out.println(n+" |     "+abuoutput+" |     "+defoutput+" |     "+peroutput+" |     "+prioutput);

                if (prioutput == inputint){
                    break;
                }
            }
        }
        else {
            System.out.println("You somehow broke the program. congrats...");
            System.exit(1);
        }
    }
}
