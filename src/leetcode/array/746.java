class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        int res = Math.min(a, b);
        for(int i = 2; i <= cost.length; i++) {
            int c = i == cost.length?0:cost[i];
            res = Math.min(a+c, b+c);
            a = b;
            b = res;
        }
        return res;
    }
}

这道题思路很简单，但是具体的实现想了半天。。
基本思路就是根据当前的cost[i]然后判断接下来走一步还是两步。
需要根据当前状态来判断接下来怎么走，就最基本的DP算法了。

因为每一次都可以走两步，所以需要判断上一步走的是一步还是走两步，这就需要保存两个状态了，即cost[i-1]和cost[i-2]。
然后判断与当前cost[i]相加，并判断哪个最小。

a=b;b=res;
这一步就是为了保存到现在这一步所需的总的cost和上一步的cost。
保存下来是为了对比下一步相加的结果。
a=b
b=res
