import java.util.*;
import java.io.*;

class Cbt{
  String username, password;
  Boolean flag;
  public static void main(String[] args) {
    
  
    
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
    f.login();   }      
            }


    
    class Faculty {
      String username, password;
      Boolean flag;
      public static Boolean Faculty() {
        
        String uname,paswd;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username : ");
        uname = s.readline();
        System.out.println("Enter password :");
        paswd = s.readline();
        FileInputStream fis = new FileInputStream("Facultylog.txt");
        String inpt ;
        while((inpt = fis.readLine()) != null)
            {
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
    class Student{
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
        while((inpt = fis.readLine()) != null)
            {
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
          }}
        
    }
    }
    class Addunp extends Teacher{

    }
    class Qnslimit extends Teacher{

    }
    class Marks extends Teacher{

    }
    class SetTime extends Teacher{

    }
    class OneAns extends Student{

    }
    class MultipleAns extends Student{

    }
    class FillInTheBlanks extends Student{

    }
    class TrueOrFalse extends Student{

    }
    class Time {

    }
    class Result {

    }
    