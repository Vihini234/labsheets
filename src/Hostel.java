/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Hostel {
    float length;
    float width;
    
    Hostel(float l,float w){
        length = l;
        width = w;
    }
    public static void main(String [] args){
        Hostel corel_beauty = new Hostel(12.66f,10.42f);
        Hostel silver_tips = new Hostel(8.54f, 6.88f);
          Hostel blue_sapphire = new Hostel(4.32f, 3.46f);
           Hostel  Cattleya = new Hostel(5.68f, 7.54f);
           
           System.out.println("The area of Cattleya is: " + Cattleya.length * Cattleya.width); 
    }
    
}
