
import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("give the number of row in the array : ");
        int a =sc.nextInt();
        System.out.print("give the number of coloum in the array : ");
        int b =sc.nextInt();
        int [][] arr=new int[a][b];
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){

                System.out.print("enter the element shoul be present in the row "+i+" and coloum "+j+" : ");
                arr[i][j]=sc.nextInt();

            }}
            int large=arr[0][0];
            int small=arr[0][0];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)
            {
                if (arr[i][j]>=large)
                {
                    large=arr[i][j];

                }
                if (arr[i][j]<=small)
                {
                    small=arr[i][j];
                }

            }
        }
        System.out.println("the largest number in the array is : " + large);
        System.out.println("the smallest number in the array is : " + small);
        
    }
    
}
