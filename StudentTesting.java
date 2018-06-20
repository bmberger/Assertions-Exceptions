
/**
 * This class tests the student class and prints out values.
 * Also, the errors thrown when improper transactions are attempted.
 *
 * @author Briana Berger
 * @version 06/09/18
 */

public class StudentTesting
{
    public static void main(String[] args)
    {
        // create student accounts
        double[] sTemp1 = {100.0,106.0, 96.8, 93.2, 89.9};
        Student st1 = new Student("Cindy", "White", sTemp1);
        
        double[] sTemp2 = {86.5,63.0, 98.1, 93.2, 78.9, 83.2, 90.2, 87.2};
        Student st2 = new Student("Sid", "Leland", sTemp2);
        
        double[] sTemp3 = {72.5, 43.2, 84.4, 32.1, 72.4, 65.3, 72.2, 98.4, 102.5};
        Student st3 = new Student("Sam", "Smith", sTemp3);

        //atempt to enter a student with no scores will produce an IllegalArgumentException
        //double[] sTemp4 = {};
        //Student st4 = new Student("Lia", "Zhang", sTemp4);
        
        //atempt to enter a student with no first name will produce a RuntimeException
        //double[] sTemp5 = {100.0,106.0, 96.8, 93.2, 89.9};
        //Student st5 = new Student("", "Smith", sTemp5);
        
        //atempt to enter a student with no last name will produce a RuntimeException
        //double[] sTemp6 = {100.0,106.0, 96.8, 93.2, 89.9};
        //Student st6 = new Student("Kira","", sTemp6);
        
        System.out.println("Student with letter grade and scores.");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        //System.out.println(st4);
        //System.out.println(st5);
        //System.out.println(st6);
    }
}
