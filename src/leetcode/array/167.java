class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        if(numbers == null || numbers.length == 0) return index;
        int left = 0, right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                index[0] = left + 1;
                index[1] = right + 1;
                break;
            }
            if(sum > target) right--;
            if(sum < target) left++;
        }
        return index;
    }
}

数组是正序排列的，所以如果两个值相加大于期望值，那么肯定是第二个数大了。
只需要将第二个数index-1，直到相等或不存在。
