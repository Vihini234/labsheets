/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Car {
    int year;
    Car(int x){
        year =x;
        
    }
    
    public static void main(String [] args){
        Car myCar = new Car(1998);
        System.out.println(myCar.year);
    }
    
}
