import java.util.Scanner;

public class largest  {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of element present in array : ");
        int a =sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            System.out.println("enter a number : "+i+"  " );
            arr[i]=sc.nextInt();

        }
        int big=arr[0];
        int smal=arr[1];
        for (int i=0;i<a;i++){
            if (arr[i]>big)
            {
                big=arr[i];
            }
            if(arr[i]<smal)
            {
                smal=arr[i];
            }
            
        }
        System.out.println("the smallest element in the arr is : "+smal);
        System.out.println("the biggest elemment in the arr is : "+big);
        
    }
    
}
