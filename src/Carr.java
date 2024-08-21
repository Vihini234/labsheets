/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Carr {
    int year;
    char model;
    String name;
    
     Carr(int y,char m,String n){
         System.out.println("Inside constructer");
         year=y ; model=m; name=n;
     }
     
     public static void main(String [] args){
         Carr myCarr = new Carr(1998,'L',"BMW");
         System.out.println(myCarr.year);
         System.out.println(myCarr.model);
         System.out.println(myCarr.name);
         
     }
    
}
