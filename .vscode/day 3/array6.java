
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a=sc.nextInt();
        int[] c=new int[a];
        for (int i = 0; i < a; i++) {
                System.out.print("Enter the elements : "+i+" ");

            c[i]=sc.nextInt();

            
        } System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
