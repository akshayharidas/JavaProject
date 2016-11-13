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
        choice();
     
}
    public void choice(){
        System.out.println("Which one you want to edit :");
        System.out.println("1. add user name and password for the user\n2.set number of questions\n3.marks for each question\n4.time duration\n5.Exit ");
        Scanner b = new Scanner (System.in);
        int ch = b.nextInt();
        switch(ch){
            case 1 : 
                this.usnps();
                break;
            case 2 :
                this.setqns();
                break;
            case 3 :
                this.setmarks();
                break;
            case 4 :
                this.settime();
                break;
            case 5 :
                break;
            default :
                System.out.println("Wrong choice");
                choice();
                break;
        }
    }
    public void usnps(){
        AddStudent as = new AddStudent();
        as.student();
    }
    public void setqns(){
        SetQns q = new SetQns();
        q.qns();
    }
    public void setmarks(){
        SetQns q = new SetQns();
        q.marks();
    }
    public void settime(){
        SetQns q = new SetQns();
        q.time();
    }
}
    
