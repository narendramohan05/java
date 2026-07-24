
import java.util.Scanner;

public class array15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+ " ");


            }
            System.out.println(" ");
            }
   int large=Integer.MIN_VALUE;
   int index=0;
   
               for (int i=0;i<a;i++){
                int small=0;
            for(int j=0;j<b;j++){
                small+=arr[i][j];
                
            }
            System.out.println("the row "+i+"->"+small);
        if(large<small){
            large=small;
            index=i;
        }
    }
    System.out.println("the largest num "+large);
    System.out.println("its index : "+index);
    }
    

    
}
