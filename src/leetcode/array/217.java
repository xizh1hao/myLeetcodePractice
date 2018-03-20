class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}

这道题有三种思路。
第一种是遍历两次，时间复杂度是O(n2)。
第二种就是排序以后判断相邻两个元素值是否相等，时间复杂度是O(nlogn)。
第三种就是用java里的Set集合去重，然后遍历看是否包含，不包含就将该元素add到set集合里，遍历添加和判断。
