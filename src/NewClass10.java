/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NewClass10 {
    public static void main(String [] args){
        int num;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        switch(num){
            case 1:
                System.out.println("you entered one");
                break;
            case 2:
                System.out.println("you entered two");
                break;
                
            case 3:
                System.out.println("you entered three");
                break;
                
            default:
                System.out.println("you entered a different number");
                
                
        }
    }
    
}
