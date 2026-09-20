
import java.util.Scanner;

public class string4 {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str2="";
    for(int i=str.length()-1;i>=0;i--)

    {
        str2+=str.charAt(i);
        
    }
    boolean same=true;
    for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str2.charAt(i)){
                same=false;
                break;

}
    }
if(same){ 
    System.out.println("is Palindrome");
}
else{
    System.out.println("not Palindrome");
}
    
}}
