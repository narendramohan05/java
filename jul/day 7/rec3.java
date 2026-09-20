public class rec3 {
    static int count(int n){
        if (n<=0){
        return 0;}
          return n%10+count(n/10);
    }
  
    public static void main(String[] args) {
        System.out.println(count(19992));
    }
}
