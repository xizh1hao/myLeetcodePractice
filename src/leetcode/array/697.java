class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> start = new HashMap<Integer, Integer>();
        Map<Integer, Integer> end = new HashMap<Integer, Integer>();
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!count.containsKey(nums[i])) {
                count.put(nums[i], 0);
                start.put(nums[i], i);
            }
            count.put(nums[i], count.get(nums[i]) + 1);
            end.put(nums[i], i);
            maxCount = Math.max(maxCount, count.get(nums[i]));
        }
        int minLength = Integer.MAX_VALUE;
        for(Integer key : count.keySet()) {
            if(count.get(key) == maxCount) {
                minLength = Math.min(minLength, end.get(key) - start.get(key) + 1);
            }
        }
        return minLength;
    }
}

创建三个map，start,end,count。
start用来保存某个元素的首次出现的位置，end用来保存该元素最后一次出现的位置，count用来保存该元素出现的次数。
然后在遍历过程中，找到最大的degree。

在第二个循环中，找到最大degree的元素，因为最大degree可能对应对个元素，所以需要取长度最小的子集。

