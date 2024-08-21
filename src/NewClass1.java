/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClass1 {
    
   public static void main(String [] args){
       Scanner scanner = new Scanner (System.in);
       
       System.out.print("Enter a string: ");
       String inputString = scanner.nextLine();
       
       System.out.print("Enter a delimeter ");
       String delimiter = scanner.nextLine();
       
       String[] substrings = inputString.split(delimiter); 
       
       System.out.println("The string was split in to the following substring :");
       
           for ( String substring : substrings){
               System.out.println(substring.trim());
           }
           
           scanner.close();
   }
    
}
