class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int num = bits.length, i = 0;
        while(i < num - 1) {
            if(bits[i] == 0) i++;
            else i += 2;
        }
        return i == num - 1;
    }
}

这道题是需要从数组第0位开始判断，如果是1，那么后面的一位不管是1还是0，都可以组成两位。所以直接让索引+2。
加2以后再判断数组元素值是0还是1，知道倒数第二位。
因为最后一位始终为0，所以只需要判断到倒数第二位。
假设到倒数第二位正好倒数第三位是1，返回true。
