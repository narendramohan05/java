
import java.util.Scanner;

public class povneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of element in the array : ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i <a; i++) {
            arr[i]=sc.nextInt();
        }
        int pov=0;
        int neg=0;
        for (int i=0;i<a; i++){
            if (arr[i]>0)
                pov++;
            if(arr[i]<0)
                neg++;
        }
System.out.println("the number of postive number is : "+pov);
System.out.println("the number of negtive number is : "+neg);
    }
    
}
