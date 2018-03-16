class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    res = Math.max(res, areasOfIsland(grid, i, j));
                }
            }
        }
        return res;
    }
    
    public int areasOfIsland(int[][] grid, int i, int j) {
        if(i >= 0 && i <  grid.length && j >= 0 && j <  grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + areasOfIsland(grid, i-1, j) + areasOfIsland(grid, i+1, j)+ areasOfIsland(grid, i, j-1)+ areasOfIsland(grid, i, j+1);
        }
        return 0;
    }
}

这个题目刚开始的时候没想到用递归，然后就一直不知道怎么处理找到1以后的流程，想了一些办法发现很麻烦而且进行到一半就进行不下去了。
然后看了discuss，看到别人用的迭代，然后豁然开朗。
