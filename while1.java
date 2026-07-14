import java.util.*;
class while1 {
    public static void main(String[] arg) {
    Scanner M = new Scanner(System.in);
    System.out.println("enter the number : ");
    int b=M.nextInt();
    int sum=0;
    int sumeven=1;
    int i=0;
      while(i<=b)
      {
        sum+=i;
        i+=2;
      } 
      i=1;
      while(i<=b)
      {
        sumeven+=i;
        i+=2;
      }
    System.out.println("the total value of odd number upto "+b+" is  : "+sum);  
    System.out.println("the total value of even number upto "+b+" is  : "+sum);
   }
}
