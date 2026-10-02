class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ZeroPosition = 0;
        for(int current = 0; current < n ;current++)
        {
            if(nums[current] != 0){
                int temp = nums[current];
                nums[current] = nums[ZeroPosition];
                nums[ZeroPosition] = temp;
                ZeroPosition++;
            }
        }
    }
}