import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


interface loginpage
{
    public void login();
}

public class Cbt {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("\nSelect Category");
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
