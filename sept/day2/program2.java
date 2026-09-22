
import java.util.*;

public class program2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        
    map.put("narendra mohan", 91);
    map.put("pudapast", 291);

    map.put("aadad pad", 29);
    map.put("naren", 01);



        System.out.print("enter the name : ");
        String name=sc.nextLine();
        if(map.containsKey(name)){
            System.out.println(name+" age is  "+map.get(name));
        }else{
            System.err.println("the name not found ");
        }

    }
    
}
