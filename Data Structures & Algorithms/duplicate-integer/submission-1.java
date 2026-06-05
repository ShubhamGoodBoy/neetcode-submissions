class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i=0;
        for(int a=0;a<nums.length;a++){
            for(int j=a+1;j<nums.length;j++){
                if(nums[a]==nums[j]){
                    return true;
                }
            }
            

        }
        return false;

    }
}