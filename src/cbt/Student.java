/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author cv
 */
public class Student {
    String username, password;
    Boolean flag;
    public void login (){ 
        String uname,paswd;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username : ");
        uname = s.readline();
        System.out.println("Enter password :");
        paswd = s.readline();
        FileInputStream fis = new FileInputStream("Studentlog.txt");
        String inpt ;
        while((inpt = fis.readLine()) != null){
            for(String val: input.split(" ")){
                if(uname == val){
                    if(paswd == input.split(" ")[1]){
                    flag=True;
                    } 
                    else{
                    System.out.println("Invalid Credentials");
                    return false;
                    }
                }
                input = f.readline();
            }
            if(flag == True){
            System.out.println("Login successful");
            }
            else{
            System.out.println("No such username");
            }
        }
        
    }

}
