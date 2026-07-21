public class recursion {
    
    static int num5(int n){
          System.out.println(n);
        if (n==0 || n==1){
            return 1;
            
        }
      
        
       return n*num5(n-1);

    }
    public static void main(String[] args) {
        
        System.out.println(num5(5));
    }
    
}
