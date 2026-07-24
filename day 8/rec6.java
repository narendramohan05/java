public class rec6 {
    static int expo(int n,int i){
        if(i==0){
            return 1;
        }
        return n*expo(n, i-1);
    }
    public static void main(String[] args) {
        System.out.println(expo(2, 25));
    }
}
