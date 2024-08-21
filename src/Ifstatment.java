/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Ifstatment {
    public static void main(String [] args){
    int age;
    Scanner scan = new Scanner (System.in);
     System.out.println("enter your age :");
     age = scan.nextInt();
     
     if (age>=18){
         System.out.println("you can vote");
     }else{
          System.out.println("you can't  vote");
     }
     scan.close();
    }
}
