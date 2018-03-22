class Solution {
    public int missingNumber(int[] nums) {
        int val = nums.length;
        int sum = val*(val + 1)/2;
        for(int i = 0; i < val; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}

数组是从0到n中缺少了某个数，所以只需要求出0到n的和，然后再减去数组中所有的元素值就可以得到缺少的数。
