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
        double average; // média das notas
        
        total = 0;
        gradeCounter = 0;
        grade = 0;
        
        while(grade != -1)
        {

            System.out.println("Enter grade (-1 to finish)");
            grade = input.nextInt();
            if (grade != -1){
                total = total + grade; 
                gradeCounter++;
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
} 
