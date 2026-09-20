import java.util.Scanner;
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num of elements: ");
        int n = sc.nextInt();
        int lar = Integer.MIN_VALUE;
        int sec_lar = Integer.MIN_VALUE;
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > lar) {
                sec_lar = lar;
                lar = num;
            } else if (num > sec_lar && num != lar) {
                sec_lar = num;
            }
        }
        if (sec_lar == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second-lar num.");
        } else {
            System.out.println("Second lar num: " + sec_lar);
        }
    }
}
