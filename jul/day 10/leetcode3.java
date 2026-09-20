public class leetcode3 {

    public static void main(String[] args) {
        leetcode3 solution = new leetcode3();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = solution.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Unique values: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println();
    }
  
    public int removeDuplicates(int[] nums) {
       int a=0;
       int b=1; 
        while(b!=nums.length){
            if(nums[a]!=nums[b]){
                nums[a+1]=nums[b];
                a++;
                
            }
           
            b++;
        }
        int k=a+1;
        return k;

        
    }
}
    

