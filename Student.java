import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Student {
    String username, password;
    Boolean flag;



    public void login () throws FileNotFoundException, IOException, NullPointerException{
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
            if(uname.equals(element[0])) {
                if(paswd.equals(element[1])){
                    flag=true;
                }
                else{
                System.out.println("Invalid Credentials\n\n");
                }
                }
            }


            if(flag == true){
            System.out.println("Login successful\n\n");

            }
            else{
            System.out.println("No such username");
            }
            choice();
        }
    public void choice() throws IOException{

        System.out.println("Select your choice:");
        System.out.println("1.Start exam \n2.Marks Scored\n3.logout ");
        Scanner z = new Scanner(System.in);
        int i = z.nextInt();
        switch(i){
                case 1 :
                  this.option();
                    break;
                case 2 :
                  //mark();
                    break;
                case 3 :
                  //logout();
                    break;
                case 4 :
                    break;
                
                default :
                    System.out.println("Wrong choice");
                    option();
                    break;
            }
            }

    public void option() throws IOException{
            System.out.println("Which type of questions do you want ?");
            System.out.println("1.MCQ \n2.Fill in the blanks\n3. True or False \n4.MCQ with more than one correct\n5.Exit ");
            Scanner b = new Scanner (System.in);
            int ch = b.nextInt();
            switch(ch){
                case 1 :
                  this.mcq();
                    break;
                case 2 :
                    //this.fb();
                    break;
                case 3 :
                    //this.tf();
                    break;
                case 4 :
                    //this.mcqmore();
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Wrong choice");
                    option();
                    break;
            }
        }

public void mcq() throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("mcq.txt"));
    String line;
    int count=1;
    while((line = br.readLine()) != null){
        PrintWriter writer = new PrintWriter(new FileWriter("test.txt", true));
        System.out.println(line);
    if(count % 6 ==0)
    {
        System.out.println("Enter Option");
        Scanner a = new Scanner(System.in);
        String n = a.nextLine();
        writer.println(n);

      //  mark();
    }
    count++;
    writer.close();
    }
}
//public void mark(){
  //   Marks m = new Marks();
    // m.marks();

}

//public void fb() throws IOException{
    
    
//
//}
//public void tf(){
    
//}
//public void mcqmore(){
    
//}
//public void logout(){

//}

//}
