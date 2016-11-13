/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cv
 */
public class Faculty {
     String username, password;
    Boolean flag;
    public void login() throws FileNotFoundException, IOException {    
    String uname,paswd;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter username : ");
    uname = s.nextLine();
    System.out.println("Enter password :");
    paswd = s.nextLine();
    BufferedReader br = new BufferedReader(new FileReader("Facultylog.txt"));
    String inpt = null ;
   while((inpt =br.readLine()) != null){
       String[] element;
        element = inpt.split(",");
            if(uname.equals(element[0]) && paswd.equals(element[1])){
                    flag=true;
                } 
                else{
                System.out.println("Invalid Credentials");
                }
            
           
        }
        if(flag == true){
            System.out.println("Login successful");
        }
        else{
            System.out.println("No such username");
        }
     
}
}
    
