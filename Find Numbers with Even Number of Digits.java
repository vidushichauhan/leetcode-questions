class Solution {
    public int findNumbers(int[] nums) {
    int co=0;
        
        for(int i=0;i<nums.length;i++){
         int c=nums[i];
            int count=0;
            while(c!=0){
                c=c/10;
                count++;
            }
            if(count%2==0){co++;} 
        }
        
        return co;
        
    }
    
}