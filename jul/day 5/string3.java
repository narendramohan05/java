
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        int spc=0;
        int al=0;
        int countnum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9'){
                countnum++;
                
            }else if(ch>='a' && ch<='z'|| ch >='A' && ch >='Z'){

                al++;
            }
            else{
                spc++;
            }
        }
        System.out.println("the number of letter in the  string ; "+al);
        System.out.println("THE NNUMBER OF INTEGER IN THE STRING :"+countnum);
        System.out.println("the number of special char : "+spc);
    }
    
}
