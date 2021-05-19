class Solution {
    public int removeDuplicates(int[] nums) {
        int sum=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){sum=sum+1;}
            else{continue;}
        }
        
        return sum+1;        
    }
}