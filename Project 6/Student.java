// Jacob Auclair
// jacobauclair@my.ccsu.edu
// CS 151
// Section 70

public class Student
{
    // This is the student class and represents the object framework of each student in the array
    // these variables are private to protect the data for each student and follow the encapsulation
    // principle
    private String fname, lname;
    private int grade;
    // This represents the name and grade of each student
    public Student(String fname, String lname, int grade)
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
    }
    // this returns the first name of the student
    public String getFname(){
        return fname;
    }
    // this returns the last name of the student
    public String getLname(){
        return lname;
    }
    // this returns the grade of the student
    public int getGrade(){
        return grade;
    }
    // this represents the string output of each student
    public String toString(){
        return fname + " " + lname + "\t" + grade;
    }
}
