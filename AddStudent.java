import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class AddStudent {
    public void student(){
        char choice = 'y';
        while(choice == 'y' || choice == 'Y'){
        System.out.println("Enter Username and Password");
        Scanner a = new Scanner(System.in);
        String us = a.nextLine();
        String ps = a.nextLine();
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("Studentlog.txt", true));
            writer.println(us + "," + ps);
            writer.close();
           } 
        catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Do you want to continue?");
        choice = a.nextLine().charAt(0);
        }
    } 
}
