/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */


class Login {
    private String storedUsername;
    private String storedPassword;
    
    public void setCredentials(String username, String password) {
        this.storedUsername = username ;
        this.storedPassword = password;
        
    }
    
     public boolean checkUserName( String username) {
        
      
        
        if(username.contains( "_") && username.length() <=5){
            return true;
            
        } else {
            return false; 
        }
    }
     
     public boolean verifyUsername( String verifyUsername, String username){
       
        return verifyUsername.equals( username); 
        
    }
    
    public boolean checkPassword( String password) {
        if (password.length() >= 8 && password.matches( ".*[A-Z].*")&& password.matches( ".*[0-9].*") && password.matches( ".*[!@#$%^&*()_+-={}|:;',./<>?].*")) {
            return true;
            
        }
        else {
            return false;
            
        }
        
    }
    
    public boolean verifyPassword(String verifyPassword, String password) {

        return verifyPassword.equals( password);

    }
    public boolean checkCellPhoneNumber(String number){
        if (number.startsWith("+27") && number.length() == 12) {
            return true;
        } else {
            return false;

        }
    }
    
    
    
    
    public boolean verifyCellPhoneNumber ( String verifyCellPhoneNumber, String CellPhoneNumber) {
        
        return verifyCellPhoneNumber.equals( CellPhoneNumber);
    }
    
    public boolean login( String enteredUsername , String enteredPassword, String storedUsername, String storedPassword ) {
       return enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
       
    }
   
  
       
    
   }
    
