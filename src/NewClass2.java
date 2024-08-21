/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClass2 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String reversedString = "";
        
        for(int i = inputString.length()-1;i>=0;i--){
            reversedString += inputString.charAt(i);
        }
    
        
         System.out.println("Reversed String " + reversedString);
         
         scanner.close();
         
}
     
}
