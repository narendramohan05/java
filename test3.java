
import java.util.Scanner;

class mohan{
    public static void main(String[]arg){
      Scanner M = new Scanner(System.in);
    while (true) { 
    System.out.print("Enter your ammount : ");

      int bal = M.nextInt();
      if( bal<=1000)
      {
        System.out.println("Insufficient Balance");
      }
    else if (bal >1000)
    {
                System.out.println("sufficient Balance");

    }
    else
    {
        System.out.println("Unable to withdeaw");
    }
        
    }
        
    }
    
}