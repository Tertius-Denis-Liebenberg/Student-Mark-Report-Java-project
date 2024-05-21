package com.mycompany.fa2;
import java.util.*;
import javax.swing.JOptionPane;

class Student{
    // Student variables
    public String studentNumber;
    public double testResult, assignmentResult, examResult;
    
    // Student constructor accepts valueas for variables
    Student(String studentNumber, double testResult, double assignmentResult, double examResult){
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    public double getTestResult(){
        return this.testResult;
    }
    
    public double getAssignmentResult(){
        return this.assignmentResult;
    }
    
    public double getExamResult(){
        return this.examResult;
    }
}

class Student_Report extends Student{
    Student_Report(String studentNumber, double testResult, double assignmentResult, double examResult){
        super(studentNumber, testResult, assignmentResult, examResult);
    }
    
    @Override    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    @Override
    public double getTestResult(){
        return this.testResult * 0.25;
    }
    
    @Override
    public double getAssignmentResult(){
        return this.assignmentResult * 0.25;
    }
    
    @Override
    public double getExamResult(){
        return this.examResult * 0.5;
    }
    
    public double print_Report(){
        return (this.getTestResult() + this.getAssignmentResult() + this.getExamResult());
    }
}

public class studentMarksReport {
    // Use public static variables to obtain user inputs
    public static String studentNumber = "";
    public static double testResult = 0;
    public static double assignmentResult = 0;
    public static double examResult = 0;
    
    public static void main(String[] args){
        userInput();
        
        // Creates object for constructor
        Student_Report studentRep = new Student_Report(studentNumber, testResult, assignmentResult, examResult);
        
        // Display Report details
        JOptionPane.showMessageDialog(null, "Student number: " + studentRep.getStudentNumber() 
                + "\n\n---------------------------------------------------------------------------\n"
                + "Mark types                   |Weight                 |Student Mark\n"
                + "---------------------------------------------------------------------------\n"
                + "Test Result                  | 25%                     | " + studentRep.getTestResult()
                + "\nAssignment Result      | 25%                     | " + studentRep.getAssignmentResult()
                + "\nExam Result                 | 50%                     | " + studentRep.getExamResult()
                + "\n---------------------------------------------------------------------------\n"
                + "Year total:                                                   | " + studentRep.print_Report() + "%"
                + "\n---------------------------------------------------------------------------\n");
    }
    
    // Asks for user inputs and checks them for errors
    public static void userInput(){
        try{
            int number = Integer.valueOf(JOptionPane.showInputDialog("Please enter the student's five digit student number"));
            studentNumber = String.valueOf(number);
            NumberChecker(studentNumber);
            
            testResult = Double.valueOf(JOptionPane.showInputDialog("Please enter the student's test result out of 100"));
            ResultChecker(testResult);
            assignmentResult = Double.valueOf(JOptionPane.showInputDialog("Please enter the student's assignment result out of 100"));
            ResultChecker(assignmentResult);
            examResult = Double.valueOf(JOptionPane.showInputDialog("Please enter the student's exam result out of 100"));
            ResultChecker(examResult);
            
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You have entered an incorrect value type!"
                    + "\n Please try again!");
            userInput();
        }
    }
    
    public static void NumberChecker(String studentNumber){
        if (studentNumber.length() > 5 || studentNumber.length() < 5){
            JOptionPane.showMessageDialog(null, "The student number you have entered, is not wihin range! "
                    + "\nPlease try again!");
            userInput();
        }
    }
    
    // Checks student results for errors
    public static void ResultChecker(double result){
        if (result < 0 || result > 100){
            JOptionPane.showMessageDialog(null, "The student result you have entered, is not wihin range! "
                    + "\nPlease try again!");
            userInput();
        }
    }
}
