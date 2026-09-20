
public class string2 {
    public static void main(String[] args) {
        
 int count=0;
String str="narendra mohan";
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
    }
}

System.out.println(count);



    }

    
}
