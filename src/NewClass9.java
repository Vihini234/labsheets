/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner; 
public class NewClass9 {
    public static void main(String [] args){
        float temp;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter todays temperature :");
        temp = scanner.nextFloat();
        
        if (temp<25){
            System.out.println("today is cold");
        }else{
            System.out.println("today is hot");
            
        } 
            
        
    }
    
}
