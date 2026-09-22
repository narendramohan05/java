
import java.util.HashMap;
import java.util.Scanner;



public class program1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        Scanner sc=new Scanner(System.in);
       /** 
       for (int i = 0;i < 6; i++) {
            int a=sc.nextInt();
            map.put(i,a);
        }
       System.out.println( map.containsValue(3)); */

       map.put("mohan",21);
       map.put("partha",99);
       map.put("narendra mohan",41);
        System.err.println("the narendra mohan age is :"+map.get("narendra mohan"));

    }

    
}