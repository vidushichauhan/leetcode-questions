class Solution {
    public int removeElement(int[] nums, int val) {
    int i=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val){
                nums[i]=nums[k];
                i++;
            }
        }
        return i;
    }
}