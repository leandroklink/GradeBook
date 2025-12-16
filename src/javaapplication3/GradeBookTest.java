/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Leandro
 */
public class GradeBookTest {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.printf("Initial course name is: %s \n ",
                myGradeBook.getCourseName());
        
        System.out.println("Please enter the course name: ");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
        System.out.println("");
        
        myGradeBook.displayMessage();
    }
}
