/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Leandro
 */
public class GradeBook{
    
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;
    
    
    public GradeBook ( String name ){
        courseName = name;   
    }
    public void setCourseName( String name){
        courseName = name;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void displayMessage()
    {
        System.out.printf("Welcome to the GradeBook for %s! ", getCourseName());
    }
    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);
        
        double average;
        int grade = 0; //valor da nota inserida pelo usuário

        

        
        while(grade != -1)
        {
            System.out.println("Enter grade (-1 to finish)");
            grade = input.nextInt();
            if (grade != -1){
                total = total + grade; 
                gradeCounter++;
                
                incrementLetterGradeCounter(grade);
            }
    }
    
        if (gradeCounter <= 0){
            System.out.println("No notes entered!");
        }else{
            average = (double) total/gradeCounter;
            System.out.printf("\nTotal of all %d grades is %d\n",gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
        }
       
    } 
    private void incrementLetterGradeCounter( int grade){
        switch (grade /10){
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;  
        }
        
    }
    public void displayGradeReport(){
        System.out.println("\nGrade Report: ");
        
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average in %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
                    "Number of students who received each grade:", 
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else{
            System.out.println("");
        }
    }
} 