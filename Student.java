import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


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
                System.out.println("\n\nInvalid Credentials\n\n");
                }
                }
            }


            if(flag == true){
            System.out.println("\n\nLogin successful*\n\n");

            }
            else{
            System.out.println("No such username");
            }
            choice();
        }
    public void choice() throws IOException{
        System.out.println("---------------------------------------------------");
        System.out.println("               Student Login"                       );
        System.out.println("---------------------------------------------------");
        System.out.println("\nSelect your choice:\n");
        System.out.println("1.Start exam \n2.Marks Scored\n3.logout\n ");
        Scanner z = new Scanner(System.in);
        int i = z.nextInt();
        switch(i){
                case 1 :
                  this.rule();
                    break;
                case 2 :
                  //mark()
;                    break;
                case 3 :
                  logout();
                    break;
                case 4 :
                    break;
                
                default :
                    System.out.println("Wrong choice");
                    option();
                    break;
            }
            }
     public void rule() throws IOException{
          Rules r = new Rules();
             r.rules();
            System.out.println("press y to continue");
          Scanner az = new Scanner(System.in);
              char z = az.nextLine().charAt(0);
             if(z == 'y' || z =='Y'){
            option();}
            else
               System.out.println("Wrong entry");

    }
    public void option() throws IOException{
            
            
            System.out.println("\nWhich type of questions do you want ?");
            System.out.println("\n1.MCQ \n2.Fill in the blanks\n3. True or False \n4.MCQ with more than one correct\n5.Exit\n");
            Scanner b = new Scanner (System.in);
            int ch = b.nextInt();
            new Reminder(1*60);
            System.out.println("Task scheduled*");
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
                    this.exit();
                    break;
                default :
                    System.out.println("Wrong choice");
                    option();
                    break;
            }
        }

public void mcq() throws IOException{
   
    BufferedReader br1 = new BufferedReader(new FileReader("amcq.txt"));
     int mark =0;
    try( BufferedReader br = new BufferedReader(new FileReader("mcq.txt"));){
       String line;
       
        int count=1; 
    while((line = br.readLine()) != null){
       
        System.out.println("\n"+line);
        count++; 
    if(count % 6 ==0)
    {
        System.out.println("Enter Option\n");
        Scanner a = new Scanner(System.in); 
        String n = a.nextLine();
        
         String ans = br1.readLine();

         if(n.equals(ans)){
                System.out.println("\nCorrect!");
                  mark++;
                  count=0;
              }
              
              else{
                System.out.println("\nWrong!");
              }
          }
      }

     }catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("\nScore board :" + mark);
  }
      
  
    
    

public void exit() throws IOException{
  System.exit(0);
}


public void fb() throws IOException{
    
     BufferedReader br1 = new BufferedReader(new FileReader("afb.txt"));
     int mark =0;
    try( BufferedReader br = new BufferedReader(new FileReader("fb.txt"));){
       String line;
       
        int count=1; 
    while((line = br.readLine()) != null){
       
        System.out.println(line);
        count++; 
    if(count % 2 ==0)
    {
        System.out.println("\nEnter Option");
        Scanner a = new Scanner(System.in); 
        String n = a.nextLine();
       
         String ans = br1.readLine();

         if(n.equals(ans)){
                System.out.println("\nCorrect!");
                  mark++;
                  count=0;
              }
              
              else{
                System.out.println("\nWrong!");
              }
          }
      }

     }catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("\nScore board :" + mark);
    
  }



public void tf() throws IOException{
    BufferedReader br1 = new BufferedReader(new FileReader("atf.txt"));
     int mark =0;
    try( BufferedReader br = new BufferedReader(new FileReader("tf.txt"));){
       String line;
       
        int count=1; 
    while((line = br.readLine()) != null){
       
        System.out.println("\n"+line);
        count++; 
    if(count % 2 ==0)
    {
        System.out.println("\nEnter Option");
        Scanner a = new Scanner(System.in); 
        String n = a.nextLine();
        
         String ans = br1.readLine();

         if(n.equals(ans)){
                System.out.println("\nCorrect!");
                  mark++;
                  count=0;
              }
              
              else{
                System.out.println("\nWrong!");
              }
          }
      }

     }catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("\nScore board :" + mark);
}
public void mcqmore() throws IOException{
    BufferedReader br1 = new BufferedReader(new FileReader("amcqmore.txt"));
     int mark =0;
    try( BufferedReader br = new BufferedReader(new FileReader("mcqmore.txt"));){
       String line;
       
        int count=1; 
    while((line = br.readLine()) != null){
       
        System.out.println("\n"+line);
        count++; 
    if(count % 6 ==0)
    {
        System.out.println("\nEnter Option");
        Scanner a = new Scanner(System.in); 
        String n = a.nextLine();
       
        /*String[] element; 
        element = inpt.split(",");    
        if(a.equals(element[i]) || a.equals(element[i+1])){
         System.out.println("Correct!");*/


         String ans = br1.readLine();

         if(n.equals(ans)){
                System.out.println("\nCorrect!");
                  mark++;
                  count=0;
              }
              
              else{
                System.out.println("\nWrong!");
              }
          }
      }

     }catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("\nScore bored :" + mark);
}

public void logout(){
  System.exit(0);
}


}


class Reminder extends Student{
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
  }

    class RemindTask extends TimerTask {
        public void run() {

            System.out.println("\nTime's up!");
            //System.out.println("\nScore bored :" + mark);
            timer.cancel(); //Terminate the timer thread
            System.exit(0);

        }
    } 
}