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
        
        GradeBook gradeBook1 = new GradeBook("CS101 Introductiuon to Java Promramminmg");
        GradeBook gradeBook2 = new GradeBook("CS102 Data Sctructures in Java");
        
        System.out.printf("GradeBook1 course name is: %s \n", gradeBook1.getCourseName());
        System.out.printf("GradeBook2 course name is: %s \n", gradeBook2.getCourseName());
        
    }
}
