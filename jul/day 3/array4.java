import java.util.Scanner;
class array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int z=0;
        int n = sc.nextInt();
        int[] b =new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println("The element of "+i+ " " +b[i]);
        }System.out.println(" ");
       for(int i =0;i<b.length;i++){
          a+=b[i];
        System.out.println("The sum of array is "+ a);
  System.out.println("The sum of array  aravage is "+ a/b.length);
       }}}