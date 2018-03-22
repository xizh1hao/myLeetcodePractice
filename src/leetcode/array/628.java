class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        return Math.max(nums[n] * nums[n-1] * nums[n-2], nums[0] * nums[1] * nums[n]);
    }
}

这道题排序以后要取得三个数的最大乘积，只有两种情况：
当只有一个或以下的负数时，最大乘积是最后三个数。
当有两个或以上的负数时，最大乘积可能是最后三个数或者前面两个数和最后一个负数。
