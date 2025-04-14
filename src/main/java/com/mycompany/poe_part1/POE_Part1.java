/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
//import Scanner
import java.util.Scanner;

public class POE_Part1 {
    
    
   
    public static void main(String[] args) {
        // Creating an instance to create a class
        Login objLogin = new Login();
        
        //Creating scanner class
        Scanner input = new Scanner( System.in);
        
        
        System.out.println( "\nthe User register their details");
        
        //Prompt the user to enter their first name
        System.out.print( "Please enter your first name: ");
        String firstname = input.nextLine();
        
        //Prompt the user for their Last name
        System.out.println( "Please enter your last name: ");
        String Lastname = input.nextLine();
        
        
        // Prompt the user to enter the username for registration
        System.out.println( "Please enter the username: ");
        
        // Storing the users username on the variable
        String username = input.nextLine();
        
        // Checking if the username contains _ and has 5 characters
        if (objLogin.checkUserName(username) == true) {
        
            System.out.println( "Username successfully captured");
            
        }
        else {
            System.out.println( "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
        }
       
        //Prompt the user to enter the password
        System.out.println( "Enter the password: ");
        String password = input.nextLine();
        
        
        // Checking if the password has eight characters, capital letter, number, special character 
        if ( objLogin.checkPassword (password) == true){
            
            System.out.println( "Password correctly formatted");
          
        }
        else {
            System.out.println( "Password is not correctly formatted,Please ensure that the password contains at least eight characters, capitol letter, number and special character  ");
            
        }
        
        //Prompt the user to enter the cellphone number
        System.out.println( "Enter the cellphone number: ");
        String number = input.nextLine();
        
        //Checking if the cellphone regex
        if (objLogin.checkCellPhoneNumber(number) ==true) {
            System.out.println( "Cell Phone number successfully  added");
        }
        else {
            System.out.println( "Cell phone number incorrectly formatted, or does not contain international code");
        }
        
        System.out.println( "\n*****Prompt the user to verify their details entered*******");
       
       
       //Prompt the user to re-enter the username
        System.out.println( "Please re-enter the username you entered: ");
        String verifyUserName = input.nextLine();
        
        //Verifying the username
        if (objLogin.verifyUsername(verifyUserName, username)) {
            System.out.println( "Username matches ");
        } else {
            System.out.println( "The username does not match");
        }
        
        //Prompt the user to re-enter the Password
       System.out.println( "Please confirm the Password you entered: ");
       String verifyPassword = input.nextLine();
        
        //Verifying the Password
        if (objLogin.verifyPassword(verifyPassword, password)) {
            System.out.println( "The Password matches");
            
        }else {
            System.out.println( "The Password does not match");
        }
        
        //Prompt the user to re-enter the Cellphone number entered
        System.out.println( "Please confirm the CellPhone Number you entered: ");
        String verifyCellPhoneNumber = input.nextLine();
        
        //Verifying the CellPhone Number
        if (objLogin.verifyCellPhoneNumber(verifyCellPhoneNumber, number)){
            System.out.println( "The CellPhone  matches");
        } else {
            System.out.println( " The Cellphone Number does not match");
            
        }
        // Letting the user know that registration is complete
        System.out.println("\n**********Registration Complete*********");
        
        
        objLogin.setCredentials(username, password);
        
        //attempts to login
        int attempts = 0; 
        boolean isloggedIn = false;
        
        while (!isloggedIn && attempts <3){
           
        System.out.println( "\n*******Login*********");
        
        // the user enters the username 
        System.out.println( " enter username: ");
        String loginUsername = input.nextLine();
                
        System.out.println( "Login - enter password: ");
        String loginPassword = input.nextLine();
        
        if (objLogin.login( loginUsername, loginPassword, username, password) ) {
            System.out.println( "Login Successful" + "Welcome" + " " + firstname + " " + Lastname + " " + " ! " );
            isloggedIn = true;
            
        } else {
            attempts++;
            System.out.println( "Login failed. Attempts remaining: " + (3 - attempts));
            
        }
        if (attempts ==3){
            System.out.println( "Maximum attempts reached. Exiting program");
        }
      
        }
     
        input.close();
    }

}    
    


