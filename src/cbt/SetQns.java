/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author cv
 */
public class SetQns {
    public void qns(){
    System.out.println("which type you want add :\n1.MCQ\n2.Fill in the blanks\n3.True or False\n4.MCQ with more than one answer\n5.Exit");
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
                qns();
                break;
        }
    

}
public void mcq(){
    System.out.println("How many qns u want to add ?");
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter Your Qns ");
        String qns = c.nextLine();
         qns = c.nextLine();
        System.out.println("Enter option 1 ");
        String a = c.nextLine();
        System.out.println("Enter option 2 ");
        String b = c.nextLine();
        System.out.println("Enter option 3 ");
        String d = c.nextLine();
        System.out.println("Enter option 4 ");
        String f = c.nextLine();
        System.out.println("Enter ans ");
        String o = c.nextLine();
        System.out.println("Enter mark ");
        int m = c.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("mcq.txt", true));
           
            writer.println(qns + "\n1."+ a +"\n2."+ b +"\n3."+ d + "\n4."+f+"\n\t\t\t"+m);
            writer.close();
            PrintWriter ans = new PrintWriter(new FileWriter("amcq.txt", true));
             ans.println(o );
            ans.close();
           } 
        catch (IOException e) {
            System.out.println("Error");
        }
        
    }
}
public void fb(){
    System.out.println("How many qns u want to add ?");
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter Your Qns ");
        String qns = c.nextLine();
         qns = c.nextLine();
        
        System.out.println("Enter Answer ");
        String f = c.nextLine();
        System.out.println("Enter mark ");
        int m = c.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("fb.txt", true));
           
            writer.println(qns + "\n\t\t"+m);
            PrintWriter ans = new PrintWriter(new FileWriter("afb.txt", true));
             ans.println(f );
            ans.close();
            writer.close();
           } 
        catch (IOException e) {
            System.out.println("Error");
        }
        
    }
}
public void tf(){
    System.out.println("How many qns u want to add ?");
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter Your Qns ");
        String qns = c.nextLine();
         qns = c.nextLine();
        
        System.out.println("Enter Answer ");
        String f = c.nextLine();
        System.out.println("Enter mark ");
        int m = c.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("tf.txt", true));
           
            writer.println(qns + "\n\t\t" +m );
            writer.close();
            PrintWriter ans = new PrintWriter(new FileWriter("atf.txt", true));
             ans.println(f );
            ans.close();
           } 
        catch (IOException e) {
            System.out.println("Error");
        }
        
    }
}
public void mcqmore(){
    System.out.println("How many qns u want to add ?");
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Enter Your Qns ");
        String qns = c.nextLine();
         qns = c.nextLine();
        System.out.println("Enter option 1 ");
        String a = c.nextLine();
        System.out.println("Enter option 2 ");
        String b = c.nextLine();
        System.out.println("Enter option 3 ");
        String d = c.nextLine();
        System.out.println("Enter option 4 ");
        String f = c.nextLine();
        System.out.println("Enter Ans ");
        String o = c.nextLine();
        System.out.println("Enter mark ");
        int m = c.nextInt();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("mcqmore.txt", true));
           
            writer.println(qns + "\n1."+ a +"\n2."+ b +"\n3."+ d + "\n4."+f+ "\n\t\t"+m);
            writer.close();
            PrintWriter ans = new PrintWriter(new FileWriter("amcqmore.txt", true));
             ans.println(o );
            ans.close();
           } 
        catch (IOException e) {
            System.out.println("Error");
        }
        
    }
}
public void marks(){
    
}
public void time(){
}
}

