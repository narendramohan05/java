class Solution {
    public int findNumbers(int[] nums) {
        int even_digit=0;
        for(int i =0;i<nums.length;i++){
            int count=nums[i];
            if (count==0){
                return 1;
            }
            if(count<0){
                count*=-1;
            }
            int digit=0;

            while(count>0){
                digit++;
                count/=10;}
            if (digit%2==0){
                even_digit++; 
            }
        }
        return even_digit;
        
    }
}