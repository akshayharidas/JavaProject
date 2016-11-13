/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author cv
 */
public class CBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Select Category");
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        Scanner cat = new Scanner(System.in);
        int ca = cat.nextInt();
        if(ca == 1){
            Student s = new Student();
            s.login();
          }
        else{
            Faculty f = new Faculty();
            f.login();   
        }    
    }
    
}
