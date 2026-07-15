
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a=sc.nextInt();
        int[] c=new int[a];
        for (int i = 0; i < a; i++) {
                System.out.print("Enter the elements : "+i+" ");

            c[i]=sc.nextInt();

            
        }
        int largest =c[0];
        int smallest=c[0];
        for (int i = 0; i < c.length; i++) {
            if(c[i]>largest){
                largest=c[i];
            }
            if (c[i]<smallest)
            {
                smallest=c[i];
            }
            
           
        }


        System.out.println("the largest number is "+ largest);
            System.out.println("the smallest number is "+smallest);


    }
    
}
