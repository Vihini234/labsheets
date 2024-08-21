/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClas {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter s String :");
        String inputString = scanner.nextLine();
        
        System.out.println("Enter a character count :");
        char characterToCount = scanner.next().charAt(0);
        
        int count = 0;
        
        for(int i=0; i <inputString.length();i++){
            if(inputString.charAt(i)== characterToCount){
                count ++;
                
            }
        }
        
        System.out.println("the character  "+ characterToCount +" occurs "+ count +"    times in the string");

            scanner.close();
    }
    
}
