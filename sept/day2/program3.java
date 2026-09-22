import java.util.HashMap;
import java.util.Scanner;

public class program3 { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap<String, Integer>map=new HashMap<>();
       map.put("mohan",21);
       map.put("partha",99);
       map.put("narendra mohan",41);
    System.out.print("enter a name : ");
    String name =sc.nextLine();
       if(map.containsKey(name)){
            System.out.println(name+" age is  "+map.get(name));
            
            System.out.print("enter the new age :");
            int newage=sc.nextInt();
            map.put(name, newage);
            System.out.println("the "+name+"age is updated to "+map.get(name));

       }else{
        System.out.println("the name is not found ");
       }
       
    
}
    
    
}
