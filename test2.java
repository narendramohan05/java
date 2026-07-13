
import java.util.Scanner;

class mohan{
    public static void main(String[]arg){
      Scanner M = new Scanner(System.in);
    System.out.print("Enter your age : ");

      int age = M.nextInt();
      if( age >= 18)
      {
        System.out.println("Elegiable for vote");
      }
    else
    {
                System.out.println("Elegiable for not vote");

    }

        
    }
}