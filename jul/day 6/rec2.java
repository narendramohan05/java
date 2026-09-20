
import java.util.Scanner;

public class rec2 {
    static long  fibanacci(long n){
        if(n==0)
        {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibanacci(n-1)+fibanacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long b=sc.nextInt();
        for(int i=0;i<b;i++){
        System.out.println(fibanacci(i));}
    }
}
