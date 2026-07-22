public class rec2 {
    static int sumnum(int n,int m){
        if(n>m){
            return 0;
        }
        return n+sumnum(n+1, m);

    }
    public static void main(String[] args) {
        int i=0;

        i=sumnum(1, 10000);
        System.out.println(i);
    }
    
}
