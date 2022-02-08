import java.util.*;
import java.io.*;

public class NameAge
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // declares the variables used and scanner class used
        String InputName = null;
        int MOB = 0;
        int YOB = 0;
        int i = 1;
        boolean typecheck;
        // gets the persons name and prompts them again if its wrong

        System.out.println ("What is your first name?");
        InputName = scan.nextLine();
        // will prompt the user for their month and year of birth until their imputs are correct
        do
        {
            System.out.println ("What is your month of birth?: 1 - 12, please enter twice");

            // try catch to see if their input is a valid integer 

            typecheck = Type.isInteger(Integer.toString(scan.nextInt()));
            if (typecheck == true)
            {
                MOB = scan.nextInt();
                // if statement conditional to make sure the month is within the valid range
                if (MOB > 0 && MOB < 13)
                {
                    System.out.println("What is your year of birth?: 1900 - 2016, please enter twice");
                    // try catch ti ensure the year of birth is an integer
                    typecheck = Type.isInteger(Integer.toString(scan.nextInt()));

                    if (typecheck == true)
                    {
                        YOB = scan.nextInt();
                        i++;
                    }
                    else{
                        System.out.println("That is an invalid year of birth");
                    }
                }
                else
                {
                    System.out.println("That is an invalid month of birth");
                } 
            }
            else {
                System.out.println("This is not a valid month of birth");
            }
        } // the conditional of the statement
        while ( i < 2 );
        // prints their name, month and ytear of birth
        System.out.println(" " + InputName + ", " + MOB + ", " + YOB);
        // determines thier age and prints a correct statement accordingly
        if (YOB < 1951)
        {
            System.out.println("You are a senior");
        }
        else if (YOB >= 1951 && YOB <= 1998)
        {
            System.out.println("You are an adult");
        }
        else
        {
            System.out.println("You are a child");
        }
        // if its their birthday month then it will say so
        if (MOB == 10)
        {
            System.out.println("Happy Birthday Month: " + InputName);
        }
    }
}