
import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("give the number of row in the array : ");
        int a =sc.nextInt();
        System.out.print("give the number of coloum in the array : ");
        int b =sc.nextInt();
        int [][] arr=new int[a][b];
        for(int i =0;i<b;i++){
            for(int j=0;j<b;j++){

                System.out.print("enter the element shoul be present in the row "+i+" and coloum "+j+" : ");
                arr[i][j]=sc.nextInt();

            }}
        System.out.println("the 2d array you created : ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+ " ");


            }
            System.out.println(" ");
            }
            int sum_dig=0;
            int sum_redig=0;


            for(int i=0;i<a;i++){
                    
                    sum_redig+=arr[i][a-1-i];
                
                    sum_dig+=arr[i][i];}
                    

                System.out.println("the sum of diagonal of the give matrix is : " +sum_dig);
                System.out.println("the sum of revers diagonal of the give matrix is : " +sum_redig);
            
            }
    }
    

