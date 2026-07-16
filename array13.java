
import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of row in a array");
        int a=sc.nextInt();
        int [][] arr=new int[a][a];
        for (int i=0;i<a;i++){
            for(int j=0;j<a;j++)
            {
                System.out.println("give the value of the matrix : ");
                arr[i][j]=sc.nextInt();
            }
           
        
        }
         int odd=0;
            int even=0;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++)
            {
                if (arr[i][j]%2==0)
                {    odd++;
                }
                else{
                    even++;
                }
            }
        }
        System.out.println("the number of odd num present in the array : "+odd);
        System.out.println("the number of even num present in the array : "+even);

    }
}
