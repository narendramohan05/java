
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("enter a number index of "+i+": ");
            a[i]=sc.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("the number you entered in "+i+" is "+a[i]);

            
        }
    }
    
}
