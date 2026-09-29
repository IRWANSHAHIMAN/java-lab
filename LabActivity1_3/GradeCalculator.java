package LabActivity1_3;

public class GradeCalculator {
    public static void main(String[] args) {
        int testScore = 76;
        char grade;
        
        if (testScore >= 80) {
            grade = 'A';
        } else if (testScore >= 70) {
            grade = 'B';
        } else if (testScore >= 60) {
            grade = 'C';
        } else if (testScore >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade = " + grade);
    }
}