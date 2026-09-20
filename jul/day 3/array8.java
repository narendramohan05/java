import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array  ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                pos++;
            } else if (a[i] < 0) {
                neg++;
            }
        }
        System.out.println("the number of the postive elements  = " + pos);
        System.out.println("number of the negative elements = " + neg);
    }
}