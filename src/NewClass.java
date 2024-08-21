/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Enter s string");
    String inputString = scanner.nextLine();
    
    System.out.print("Enter the character to replace ");
    char charToReplace = scanner.next().charAt(0);
    
    System.out.print("Enter the  replacement character ");
    char replacementChar = scanner.next().charAt(0);
    
    String modifiedString = inputString.replace(charToReplace, replacementChar);
    
    System.out.println("modified String" + modifiedString);
    
    scanner.close();
    
    }
    
    
}
