
import java.util.HashMap;
import java.util.Scanner;

public class pro3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the key value : ");
        int value=sc.nextInt();
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"apple");
        map.put(2,"orange");
        map.put(3,"carrot");
        map.put(4,"goat");

        if(map.containsKey(value)){
            System.out.println(map.get(value));
        }else{
            System.out.println("the element not found ");
        }





    }

}