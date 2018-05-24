class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int i = 0, j = 0, length = S.length();
        List<List<Integer>> groups = new ArrayList<>();
        while(j < length) {
            while(j < length && S.charAt(j) == S.charAt(i)) j++;
            if(j - i >= 3) groups.add(Arrays.asList(i,j-1));
            i = j;
        }
        return groups;
    }
}

这个题最开始审题没审清楚，以为是找最大的连续字符串，导致做起来麻烦了一些，但感觉还是能做 - -

这道算法很简单，唯一需要注意的就是第二个while的时候需要判断一下j需要小于数组的长度，不然最后的话可能会报错。
