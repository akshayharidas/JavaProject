/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cv
 */
public class Faculty {
     String username, password;
    Boolean flag;
    public void login() throws FileNotFoundException {    
    String uname,paswd;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter username : ");
    uname = s.nextLine();
    System.out.println("Enter password :");
    paswd = s.nextLine();
    FileInputStream fis = new FileInputStream("Facultylog.txt");
    String inpt = null ;
   
        for(String val: inpt.split(" ")){
            if(uname == val){
                if(paswd == inpt.split(" ")[1]){
                    flag=true;
                } 
                else{
                System.out.println("Invalid Credentials");
                }
            }
            inpt = fis.readline();
        }
        if(flag == true){
            System.out.println("Login successful");
        }
        else{
            System.out.println("No such username");
        }
     
}
    
