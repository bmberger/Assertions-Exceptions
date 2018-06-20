/**
 * This class defines a student and its basic functions.
 *
 * @author Briana Berger
 * @version 06/09/18
 */

public class Student
{
    private String firstName, lastName, letterGrade;
    private double[] assignmentScores;

    /**
     *  Sets up the account by defining its owner, account number,
     *  and initial balance.
     */
    public Student(String first, String last, double[] scores)
    {
        letterGrade = determineGrade(scores);
        assignmentScores = scores;
        firstName = first;
        lastName = last;
        if(firstName.equals(""))
            throw new RuntimeException("A student's first name cannot be empty."); 
        if(lastName.equals(""))
            throw new RuntimeException("A student's last name cannot be empty.");
    }

    /**
     * Determines letter grade based on a collection of scores in an array.
     */
    public String determineGrade(double[] scores)
    {
        double average = 0.0;
        double total = 0.0;
        int count = 0;
        if(scores.length == 0)
        {
            throw new IllegalArgumentException("Error: There are no grades in the argument provided.");
        }
        for(double score : scores)
        {
            total += score;
            count++;
        }
        average = total/count;
        if(average >= 90)
        {
            return "A";
        }
        else if(average >= 80)
        {
            return "B";
        }
        else if(average >= 70)
        {
            return "C";
        }
        else if(average >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    /**
     *  Returns the first name of Student.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     *  Sets the first name of Student.
     */
    public void setFirstName(String n)
    {
        firstName = n;
    }
    
    /**
     *  Returns the last name of Student.
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     *  Sets the last name of Student.
     */
    public void setLastName(String n)
    {
        lastName = n;
    }

    /**
     *  Returns the scores of all the asignments of Student.
     */
    public String getScores()
    {
        String scoresString = "";
        for(double d : assignmentScores)
        {
            scoresString += (d + "  ");
        }
        return scoresString;
    }
    
    /**
     *  Sets the scores of all the asignments of Student.
     */
    public void setScores(double[] s)
    {
        assignmentScores = s;
    }
    
    /**
     *  Returns the letter grade of Student.
     */
    public String getLetterGrade()
    {
        return letterGrade;
    }
    
    /**
     *  Sets the letter grade of Student.
     */
    public void setLetterGrade(String g)
    {
        letterGrade = g;
    }

    public String toString()
    {
        return String.format("%-6s %-4s %-5s %-5s %n", firstName, lastName, "-  " + letterGrade + ":", getScores());
    }
}
