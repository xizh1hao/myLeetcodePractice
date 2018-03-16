class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, num = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) 
                cnt = 0;
            if(nums[i] == 1) {
                cnt++;
            }
            if(cnt >= num) {
                num = cnt;
          }
        }
        return num;
    }
}

这个题是计算最多有几个1连续，很明显需要一个count来计算个数，如果碰到0，计数器归0.
然后返回遍历过程中最大的连续个数。
