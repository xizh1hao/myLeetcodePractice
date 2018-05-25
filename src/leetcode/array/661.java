class Solution {
    public int[][] imageSmoother(int[][] M) {
        int row = M.length;
        if(row == 0) return new int[0][];
        int cols = M[0].length;
        int[][] res = new int[row][cols];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                res[i][j] = smooth(M, i, j, row, cols);
            }
        }
        return res;
    }
    
    private int smooth(int[][] M,int x, int y, int row, int cols){
        int count = 0,sum = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(x + i >= 0 && x + i < row && y + j >= 0 && y + j < cols){
                    count++;
                    sum += M[x+i][y+j];
                }
            }
        }
        return sum/count;
    }
}

这个题目虽然很简单，但还是花了一些时间，主要是在smooth()中最里面的if语句里判断条件写错了，&&写成了||，导致一直报数组越界。
刚开始看到这个题。第一反应就是DFS。 - - 
