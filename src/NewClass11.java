/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClass11 {
    public static void main(String [] args){
        String str;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a programming language :");
        str = scan.nextLine();
        
        switch(str.toLowerCase()){
            case "java":
                System.out.println("You like java");
                break;
                
            case "python":
                System.out.println("you like python");
                break;
                
            default:
                System.out.println("you have to learn a programming language");
                
        }
    }
    
}
