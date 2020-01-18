// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class  Student
{
    private String studentName;
    private double test;
    private double test2;
    Scanner scan = new Scanner(System.in);

    //declare instance data

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.studentName = studentName;
        test = 0.0;
        test2 = 0.0;


        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("enter " + studentName + " score for test 1: ");
        test = scan.nextDouble();
        System.out.println("enter " + studentName + " score for test 2: ");
        test2 = scan.nextDouble();
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        double average = (test +test2)/2;
        return average;
        //add body of getAverage
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String getName()
    {
        return studentName;
        //add body of printName
    }
    public String toString()
    {
        return "name " +studentName+ " test 1: " +test + " test 2: " +test2;
    }
    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91


}
