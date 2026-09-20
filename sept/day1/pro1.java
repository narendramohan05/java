package day1;

import java.util.HashMap;

public class pro1 {
    public static void main(String[] args) {
        HashMap <Integer,String> map= new HashMap<>();
        map.put(1,"narendra mohan");       
         map.put(2,"mohan");
        map.put(3,"bhan");
        map.put(4,"nithin");
        map.put(5,"nithsh");

        for (int i=1;i<6;i++){
            System.out.println(map.get(i));

        }



    }
    
}
