
import java.util.Scanner;

public class armstringnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int amstrong=0;
        

        for (int i =a ;i<b;i++){
            int g=i;
            int counte=0;
            while(g>0){
                counte++;
                g=g/10;
            }
            g=i;
            while(g>0){
                amstrong+=(g%10)^counte;
                
            }
            if(amstrong==g){
                System.out.println(g);
            }
            
        }

    }
    
}
