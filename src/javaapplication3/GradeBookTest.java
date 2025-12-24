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
        
        int[] gradesArray = {87, 19, 96, 100, 50, 22, 89, 92, 87, 76, 48, 93};
        
        GradeBook myGradeBook = new GradeBook("CS101 Introductiuon to Java Promramminmg", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        
    }
}
