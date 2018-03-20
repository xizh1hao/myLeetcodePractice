class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(res == nums[i]) {
                count++;
            }else {
                if(count == 0) res=nums[i];
                else count--;
            }
        }
        return res;
    }
}
首先假设一个数为出现超过一半的数，遍历数组，当出现了相同的元素时，count+1，否则-1；
只要出现该元素次数大于n/2，那么最终返回的一定就是期望的元素值。

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length/2];
    }
}

排序以后的出现超过一半以上的元素一定在n/2的位置。时间复杂度是O（nlogn）
