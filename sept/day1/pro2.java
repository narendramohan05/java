
import java.util.HashMap;
import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<Integer,String> map =new HashMap<>();

        for (int i=0;i<11;i++) {
            String name=sc.nextLine();

            map.put(i,name);
        }
        System.out.println(map.containsKey(4));
            
        }
    }
    

