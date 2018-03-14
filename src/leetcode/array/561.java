先上代码。

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}

这道题刚开始想的时候用了枚举，观察结果有猜到肯定是顺序排列，但是不知道该怎么证明。
先按着自己的猜测写出了算法，然后看discuss给出了证明过程，我这里记录一下，顺便屡一下思路。

(a1, b1),(a2, b2) ... (an, bn);
Sm = a1 + a2 + ... + an;
即要证明Sm最大。

设Sa = a1 + b1 + a2 + b2 + ... + an + bn;
Sa为我们输入的数值之和，为固定值。

根据题意，bn >= an;
d1 = b1 - a1;  
...
dn = bn - an;
Sd = b1 + b2 + ... + bn - (a1 + a2 + ... + an);

要证明Sm最大，很明显需要去掉b,所以将Sa-Sd，得到：
Sa - Sd = 2(a1 + a2 + ... + an);
        = 2Sm;
∴Sm = (Sa - Sd)/2;
Sa为固定值，所以要想Sm最大，Sd应最小。

接下来使用反证法和绝对值不等式可以证明。
