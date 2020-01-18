// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Lucy");
        //create student2, "Mike"
        Student student2 = new Student("Micah");

        //input grades for Mary
        student1.inputGrades();
        //print Mary
        System.out.println(student1);
        //use getAverage to calculate & print average for Mary

        System.out.println(student1.getName() +  "s average score is " + student1.getAverage());

        //input grades for Mike
        student2.inputGrades();
        //print Mike
        System.out.println(student2);
        //use getAverage to calculate & print average for Mike
        System.out.println(student2.getName() +  "s average score is " + student2.getAverage());
    }
}

