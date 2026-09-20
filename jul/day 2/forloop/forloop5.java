package forloop;
import java.util.*;
class forloop5 {
    public static void main(String[] arg)
    {
    int a=0;
    int c=0;
        System.out.print("the enter the number : ");
      Scanner M = new Scanner(System.in);
      int b=M.nextInt();

        for (int i=0 ;i<=b;i=i+2){
            a+=i;
           
        } for (int i=1 ;i<=b;i=i+2){
            c+=i;
           
        } 
        System.out.println("the total value of odd number upto "+b+" is  : "+a);
        System.out.println("the total value of even number upto "+b+" is  : "+c);
    }
}
