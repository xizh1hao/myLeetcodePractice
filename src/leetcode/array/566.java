class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if(r*c != m*n) return nums;
        int[][] res = new int[r][c];
        for(int i = 0; i < r*c; i++) {
            res[i/c][i%c] = nums[i/n][i%n];
        }
        return res;
    }
}

这个题目刚开始自己想的是使用for循环来做：
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if(r*c != m*n) return nums;
        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[row][col] = nums[i][j];
                col++;
                if(col == c) {
                    col = 0;
                    row ++;
                }
            }
        }
        return res;
    }
}
循环两次，然后分别计算reshape后的二维数组的col和row。
看discuss的时候发现了最上面的算法，发现这种算法真的是简洁很多，而且理解起来也容易很多。

最开始的判断是否能够reshape，只需要判断两个矩阵的长度是否相等就可以了。
