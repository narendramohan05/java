import java.util.*;
class tables {
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for (int i=1;i<=20;i++){
            System.out.println(a+" X "+i+" = "+(i*a));
        }
    }
}
