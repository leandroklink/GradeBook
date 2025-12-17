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
        
        int total; //soma das notas
        int gradeCounter; //número da nota a ser inserida a seguir
        int grade; //valor da nota inserida pelo usuário
        int average; // média das notas
        
        total = 0;
        gradeCounter = 1;
        
        while(gradeCounter <= 10)
        {
            System.out.println("Enter grade");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
    }
        average = total/10;
        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
    } 
}
