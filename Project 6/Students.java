// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70

import java.util.*;
import java.io.*;

public class Students
{
    // since there is a IO used you much prepare for an exception throw that would otherwise break 
    // the program, hence the throws exception which allows such and incedent
    public static void main (String[] args) throws IOException
    {   
        // These are the values and variables used in the program
        String first_name, last_name, input;
        int grade, total=0, count=0, i, term=0, ii=0;
        // This creates an array of students up to a class size of 20 and also creates a string array
        // for the user input up to 3, since the user will not input more than 3 seperate tokens
        Student[] st = new Student[20];
        String[] strarray = new String[3];
        // creates two scanners, one for user input and one for reading form the text file
        Scanner fileInput = new Scanner(new File("students.txt"));
        Scanner userInput = new Scanner(System.in);
        // While the file has more to read it will create a new object student and add it to the array
        // of students, this then increments the class count
        while (fileInput.hasNext())
        {
            first_name = fileInput.next();
            last_name = fileInput.next();
            grade = fileInput.nextInt();
            st[count] = new Student(first_name, last_name, grade);
            count++;
        }
        // this is simply the directions that i put into a class so that i could add a help command to
        // repeat them if the user would like that
        helpme();
        // This is the creation of a string tokenizer and adds the tokens to an array, this is used for all
        // user input to help break down adn use the different parts of it for different area of the program
        while (ii == 0){
            System.out.println("Please enter a command\n");
            StringTokenizer strtok = new StringTokenizer(userInput.nextLine());
            i = 0;
            while (strtok.hasMoreElements()) {
                strarray[i] = (strtok.nextToken());
                i++;
            }
            input = strarray[0];
            // This is the main direcional of the program calling all the different commands and using
            // the first token of the string tokenizer that got put into that array to determine 
            // which of the cases to call, then the rest of the array to determine the rest of the 
            // variables needed. fairly straight forward so i wont go through each
            switch(input.toLowerCase()){  //this takes the user input for the switch-case statment, it also converts all input to lower case
                case "printall":
                printall(st, count);
                break;

                case "firstname":
                firstName(st, count, strarray[1].toUpperCase());
                break;

                case "lastname":
                lastName(st, count, strarray[1].toUpperCase());
                break;
                // This one is special since i had to parse the integer from a string to an int so that
                // the differtent variable types didnt conflict
                case "interval":
                printtInterval(st, count, Integer.parseInt(strarray[1]), Integer.parseInt(strarray[2]));
                break;

                case "sortlow":
                sortlowarray(st, count);
                break;
                
                case "sorthigh":
                sorthigharray(st, count);
                break;

                case "help":
                helpme();
                break;

                case "end":
                term = 1;
                break;

            }
            // if they use end then it will increment term and will then call this once it breaks out 
            // and will terminate the program
            if(term == 1)
            {
                System.exit(0);
            }
        }
    }
    // Thos is used to print out the exact text file, I wanted it to print out the text file original 
    // even after using a sort, so i made it a new array of the text file. 
    public static void printall(Student[] arr, int n) throws IOException {
        Scanner fileInput = new Scanner(new File("students.txt"));
        String first_name1, last_name1;
        int grade1, count1 = 0;
        while (fileInput.hasNext())
        {
            first_name1 = fileInput.next();
            last_name1 = fileInput.next();
            grade1 = fileInput.nextInt();
            arr[count1] = new Student(first_name1, last_name1, grade1);
            count1++;
        }
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
    // This will use the index of the letter of the name and if it isnt the first letter than it wont
    // comply and wont print, other wise it will and wil print the name accordingly
    public static void firstName(Student[] arr, int n, String name){
        for (int i=0; i<n; i++){
            if ((arr[i].getFname()).indexOf(name) == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("");
    }
    // the last name is the same however it does it for the last name
    public static void lastName(Student[] arr, int n, String name){
        for (int i=0; i<n; i++){
            if ((arr[i].getLname()).indexOf(name) == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("");
    }
    // this takes two integers the user inputs and uses them as parameters for the range in which the 
    // grades should be in, if they are in it, it will print that index of the student array
    public static void printtInterval(Student[] arr, int n, int a, int b){
        for (int i=0; i<n; i++){
            if (arr[i].getGrade() >= a && arr[i].getGrade() <= b){
                System.out.println(arr[i]);
            }
        }
        System.out.println("");
    }
    // This goes through the bubble sort process using a copy "dummy" array as the temperary since you copy
    // all of the array data and not just the grade, then once they are all sorted it will print them in
    // order from least to greatest
    public static void sortlowarray(Student[] arr, int n){
        for (int j = 1; j < n; j++){
            for (int i = 0; i < n; i++) {
                if (arr[i].getGrade() > arr[j].getGrade()) {
                    Student temparr[] = new Student[n]; 
                    temparr[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temparr[i];
                }
            }
        }
        for (int k=0; k<n; k++){
            System.out.println(arr[k]);
        }
        System.out.println("");
    }
    // thos is the same as the least to greatst array however it does it from greatest to least, very simply 
    // modification to change it (sign change) '< -> >'
    public static void sorthigharray(Student[] arr, int n){
        for (int j = 1; j < n; j++){
            for (int i = 0; i < n; i++) {
                if (arr[i].getGrade() < arr[j].getGrade()) {
                    Student temparr[] = new Student[n]; 
                    temparr[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temparr[i];
                }
            }
        }
        for (int k=0; k<n; k++){
            System.out.println(arr[k]);
        }
        System.out.println("");
    }
    // This is the commads and help screen that will be printed if help is typed or at the start of the
    // program
    public static void helpme (){
        System.out.println("Here is a list of commands and a description for each");
        System.out.println("printall - prints all student records (first name, last name, grade).");
        System.out.println("firstname 'name' - prints all students with first name that starts with the provided parameter name.");
        System.out.println("lastname 'name' - prints all students with first name that starts with the provided parameter name.");
        System.out.println("interval 'm' 'n' - prints all students with grades in the interval [m, n].");
        System.out.println("sortlow - sorts all of the grades of studnets from lowest to highest");
        System.out.println("sorthigh - sorts all of the grades of studnets from highest to lowest");
        System.out.println("end - exits the loop the terminates the program.");
        System.out.println("help - reprints this for your convenience incase you forget.");
        System.out.println("NOTE: It has been designed so that printall prints exactly from the student records");
        System.out.println("      and is not affected by sorting.");
    }
}
