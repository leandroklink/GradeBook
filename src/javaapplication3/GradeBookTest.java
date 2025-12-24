/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Leandro
 */
public class GradeBookTest {
    
    public static void main(String[] args){
        
        int[][] gradesArray = {{87, 91, 100},
                               {63, 87, 96}, 
                               {58, 29, 100},
                               {99, 98, 99},
                               {78, 28 , 53},
                               {49, 90, 01}, 
                               {90, 96, 92},
                               {89, 87, 82}};
        
        GradeBook myGradeBook = new GradeBook("CS101 Introductiuon to Java Promramminmg", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        
    }
}
