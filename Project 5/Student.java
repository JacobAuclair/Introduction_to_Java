// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70


public class Student
{
    // the declaration of all the variables that are used in the entire student class
    // everything from student name and grade, to counters
    private String fname, lname, EOF;
    private int grade;
    private static int total = 0, count = 0;
    private static int Etotal = 0, Ecount = 0;
    private static int Ototal = 0, Ocount = 0;
    private static int Ftotal = 0, Fcount = 0;
    // This is the student class that there are multiple instacnes of, hence the use of this.
    public Student(String fname, String lname, int grade)
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        // after there is a name and grade put in for the student, it calculates the total from
        // grade and increments the count
        total = total + grade;
        count++;
        // this is to determine if the grade is ok, excellent, of failing. 
        // whichever it is this String EOF is assigned whichever it is and the count for that
        // grade type incremets and that total is added with the grade = Ntotal
        if (grade > 89)
        {
            Etotal = Etotal+ grade;
            Ecount++;
            this.EOF = ("Excelent");
        }
        if (grade >= 60 && grade <= 89) 
        {
            Ototal = Ototal + grade;
            Ocount++;
            this.EOF = ("Ok");
        }
        if(grade < 60)
        {
            Ftotal = Ftotal + grade;
            Fcount++;
            this.EOF = ("Failure");
        }
    }
    // These return the number of total students and the average of all grades, there is no
    // total because it doesnt matter what all the grades added up are to anyone
    public static int getCount(){
        return count;
    }
    public static double getAverage(){
        return (double)total/count;
    }
    // These return the total, number of students with this grade type, and the average of their
    // grades back to the main.
    public static int getEtotal(){
        return Etotal;
    }
    public static int getEcount(){
        return Ecount;
    }
    public static double getEaverage(){
        return (double)Etotal/Ecount;
    }
    // These return the total, number of students with this grade type, and the average of their
    // grades back to the main.
    public static int getOtotal(){
        return Ototal;
    }
    public static int getOcount(){
        return Ocount;
    }
    public static double getOaverage(){
        return (double)Ototal/Ocount;
    }
    // These return the total, number of students with this grade type, and the average of their
    // grades back to the main.
    public static int getFtotal(){
        return Ftotal;
    }
    public static int getFcount(){
        return Fcount;
    }
    public static double getFaverage(){
        return (double)Ftotal/Fcount;
    }
    // This is what is used to print out the inital student with the name, grade, and their grade
    // type.
    public String toString()
    {
        return fname + " " + lname + "\t" + grade + " " + EOF;
    }
}
