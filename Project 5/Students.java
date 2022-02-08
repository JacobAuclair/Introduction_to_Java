// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70

import java.util.Scanner;
import java.io.*;
// This is the main class of the program
public class Students
{
    // need throws exception, rudamentary try/catch that does the job, necessary because of the file IO
    public static void main (String[] args) throws IOException
    {   
        // Declaclaration of all of the variables found in the text doctument of students
        // new scanner is for reading a file and setting variables equal to what it reads. 
        String first_name, last_name;
        int grade;
        Scanner fileInput = new Scanner(new File("students.txt"));
        // This will continually create new a new student class as long as there is them to create from
        // the text file it reads. Takes the name and grade and uses those variables for the student class
        while (fileInput.hasNext())
        {
            first_name = fileInput.next();
            last_name = fileInput.next();
            grade = fileInput.nextInt();
            // student class constructor
            Student st = new Student(first_name, last_name, grade);
            // prints the students name, grade, and the EOF of their grade
            System.out.println(st);
        }
        // uses the methods from the student class to print the number of student with their total average
        // then the number of Excellent, Ok, and Failing students with the total average of each seperately
        System.out.println("\nThere are " + Student.getCount() + " total students with average grade " + Student.getAverage());
        System.out.println("There are " + Student.getEcount() + " excellent students with average grade " + Student.getEaverage());
        System.out.println("There are " + Student.getOcount() + " ok students with average grade " + Student.getOaverage());
        System.out.println("There are " + Student.getFcount() + " failure students with average grade " + Student.getFaverage());
    }
}