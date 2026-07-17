import java.util.Scanner;
class array3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = sc.nextInt();
        int[] b =new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println("The element of "+i+ " " +b[i]);
        }System.out.println(" ");
       for(int i =0;i<n;i++){
        System.out.println("the value of "+a);

          a+=b[i];
        
       }System.out.println("The sum of array is "+ a);

    }
    
}