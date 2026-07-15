
import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("the the size of the array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements in the array ");
        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.print("enter the element you need to search : ");
        int key=sc.nextInt();
        boolean f=false;
        
        for (int i =0; i < n; i++) {
        if (a[i]==key){
            System.out.println("Element found at index "+i);
            f =true;
            break;
        }
            if(!f){
                System.out.println("The element not found");
            }
        }
        


    }
    
}
