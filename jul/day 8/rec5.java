public class rec5 {
    static int addsum(int n){
        if(n<=0){
            return 0;
        }
        return n+addsum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(addsum(10));
    }
    
}
