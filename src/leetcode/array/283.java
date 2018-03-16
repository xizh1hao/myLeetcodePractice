class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i =0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}

这个题目按照原本的顺序将非零数字移动到数组前面，第几个非零数字在数组第几位，所以规律很明显。
