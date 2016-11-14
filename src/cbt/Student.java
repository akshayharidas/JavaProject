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
public class Student {
    String username, password;
    Boolean flag;



    public void login () throws FileNotFoundException, IOException{
        String uname,paswd;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username : ");
        uname = s.nextLine();
        System.out.println("Enter password :");
        paswd = s.nextLine();
        BufferedReader br = new BufferedReader(new FileReader("Studentlog.txt"));
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
            option();
        }

    public void option(){
            System.out.println("Which type of questions do you want ?");
            System.out.println("1.MCQ \n2.Fill in the blanks\n3. True or False \n4.MCQ with more than one correct\n5.Exit ");
            Scanner b = new Scanner (System.in);
            int ch = b.nextInt();
            switch(ch){
                case 1 :
                  this.mcq();
                    break;
                case 2 :
                    this.fb();
                    break;
                case 3 :
                    this.tf();
                    break;
                case 4 :
                    this.mcqmore();
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Wrong choice");
                    option();
                    break;
            }
        }

public void mcq(){
    BufferedReader br = new BufferedReader(new FileReader("mcq.txt"));
    String inpt = null ;
    while((line = b.readLine()) != null){
    String[] element;
        element = inpt.split(".");
        
    }
}
public void fb(){
    
}
public void tf(){
    
}
public void mcqmore(){
    
}

}
