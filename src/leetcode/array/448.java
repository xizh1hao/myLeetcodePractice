这道题我觉得还是有一定难度的，但是看到通过率这么高感觉有点不可思议。
刚开始看到这道题的思路就是《元素归位法》。
就是讲元素放到他应该在的位置。
比如k就放在数组k-1。
如果出现两次的元素，只要返回这个元素的值。


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}
这个解法是top solution里面的，看了以后感觉很厉害。特意梳理一下思路记录一下。

基本思路还是元素归位法，将每个出现过的元素的位置的元素值置为负数，比如a[0] = 4，a[3] = 1,所以将a[3] = -1。
这就表明4出现过。
在第二个循环中，遍历查找元素值大于0的元素位置，因为元素值大于0，说明该元素没出现过。
直接返回该元素index+1就是未出现的元素值了。
