/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
/**
 *
 * @author Leandro
 */

//atualmente na página 238 do livro
public class GradeBook{
    
    private String courseName;
    private int[][] grades; //array de notas de alunos
    
    //construtor de dois argumentos
    public GradeBook ( String name, int[][] gradesArray){
        courseName = name;   
        grades = gradesArray;
    }
    public void setCourseName( String name){
        courseName = name; //armazena o nome do curso
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void displayMessage()
    {
        System.out.printf("Welcome to the GradeBook for\n%s!\n\n ", getCourseName());
    }
    public void processGrades(){
        outputGrades();
        
        System.out.printf("\nLowest grade is %d\nHighest grade is %d\n\n",
                getMinimum(), getMaximum());
        
        outputBarChart();
    }
    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] studentGrades : grades)
            for(int grade : studentGrades)
                if (grade < lowGrade)
                    lowGrade = grade;
        return lowGrade;
    }
    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int[] studentGrades : grades)
            for(int grade : studentGrades)
                if (grade > highGrade)
                    highGrade = grade;
        return highGrade;
    }
    
    public double getAverage(int[]setOfGrades){
        int total = 0;
        
        for (int grade : setOfGrades)
            total += grade;
        return (double) total / grades.length;
    }
    public void outputBarChart(){
        System.out.println("Grade distribution: ");
        
        int[] frequency = new int[11];
        for (int[] studentGrades : grades){
        
            for (int grade : studentGrades)
                ++frequency[grade/10];
        }
        for (int cont = 0; cont < frequency.length; cont++) {
            if (cont == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                cont * 10, cont * 10 + 9 );
            
            for (int stars = 0; stars < frequency[cont]; stars++) {
                System.out.print("*");
            }    
            System.out.println("");
        }
    }
    public void outputGrades(){
        System.out.println("The grades are:\n");
        System.out.print( "           " );
        
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d: ", test + 1);
        System.out.println("Average");
        
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[ student ])
                System.out.printf("%8d", test);
            
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);
        }
    }
} 