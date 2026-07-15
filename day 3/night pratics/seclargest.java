
import java.util.Scanner;

public class seclargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i =0;i<a;i++)
        {
            System.out.print("enter the "+i+" element in the array ; ");
            arr[i]=sc.nextInt();
        }
        int lar=Integer.MIN_VALUE;
        int sma=Integer.MIN_VALUE;

        for(int i=0;i<a;i++){
            if (arr[i]>lar)
            {
                sma=lar;
                lar=arr[i];
                
            }else if(arr[i]>sma && arr[i]!=lar){
                sma=arr[i];

            }
           

        }
         System.out.print("the second largest element in the array is : "+sma);

    }
}
