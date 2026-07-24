public class rec4 {
    static long rec4(long n){
        if(n==0){
            return 1;

        }
        return n*rec4(n-1);
        
    }
    
    public static void main(String[] args) {
        System.out.println(rec4(20));
    }
    
}
