/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author cv
 */
public class CBT {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
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
        else if( ca == 2){
            Faculty f = new Faculty();
            f.login();   
        } 
        else{
            System.out.println("Invalid entry");
        }
    }
    
}
