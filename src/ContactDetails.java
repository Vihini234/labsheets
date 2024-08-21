/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class ContactDetails {
    public long telephone_number;
    
}

public class ContactDetailsWrapper{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        ContactDetails contact = new ContactDetails();
        
        System.out.print("Enter the telephone number: ");
        contact.telephone_number = scanner.nextLong();
        
        String telephoneNumberWrapper = contact.telephone_number;
        String telephoneNumberWrapper = contact.telephone 
    }
}