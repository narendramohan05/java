public class rec {
    
    static void rec(int n,int i){
        if (i>n){
            return;
        }
        System.out.println(i);
        rec(n, i+1);
    }
    public static void main(String[] args) {
        rec(10, 1);
    }
}
