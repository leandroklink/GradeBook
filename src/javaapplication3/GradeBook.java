/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

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
    
}
