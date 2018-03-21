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

