
package project1;

import java.util.Scanner;


public class GradeCenter {

    public static void main(String[] args) {
        double grade1 = GetGrade(1);  ///// variables declared- start 
        double grade2 = GetGrade(2);
        double grade3 = GetGrade(3);
        double grade4 = GetGrade(4);
        double grade5 = GetGrade(5);
        
        String lettergrade = LetterGrading (grade1);
        String lettergrade2 = LetterGrading (grade2);
        String lettergrade3 = LetterGrading (grade3);
        String lettergrade4 = LetterGrading (grade4);
        String lettergrade5 = LetterGrading (grade5); ////Variables declared- end
        double avg = Average(grade1,grade2,grade3,grade4,grade5);
        String LetterGradeAvg = LetterGrading (avg);

        System.out.printf("The mark for the first course was %.1f%%, %s%n",grade1,lettergrade);      
        System.out.printf("The mark for the second course was %.1f%%, %s%n",grade2,lettergrade2);
        System.out.printf("The mark for the third course was %.1f%%, %s%n",grade3,lettergrade3);
        System.out.printf("The mark for the fourth course was %.1f%%, %s%n",grade4,lettergrade4);
        System.out.printf("The mark for the fifth course was %.1f%%, %s%n",grade5,lettergrade5);       
        System.out.printf("The overall average mark is %.1f%%, %s %n", avg,LetterGradeAvg);

    } //end of main method
    
    public static double GetGrade(double grades){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a grade: ");
        grades = keyboard.nextDouble();
        return grades;
    } //method to ask for grades to be able to use as arguments in other methods
    
     public static String LetterGrading (double LetterCompare)
 {
    if (LetterCompare <= 100 && LetterCompare >= 80) {
        return "the letter grade is A";
    } else if (LetterCompare < 79 && LetterCompare>= 70) {
        return "the letter grade is B";
    } else if (LetterCompare < 69 && LetterCompare>= 60) {
        return "the letter grade is C";
    } else if (LetterCompare < 59 && LetterCompare >= 50) {
        return "the letter grade is D";
    } else if (LetterCompare < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
} //letter grading method uses
         public static double Average (double grade1,double grade2,double grade3,double grade4,double grade5)
    {
        return (double) (grade1+grade2+grade3+grade4+grade5)/5;
        
    } //overall average method

    } //end of class
    