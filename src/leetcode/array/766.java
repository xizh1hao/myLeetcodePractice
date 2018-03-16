class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m-1; i++) {
            for(int j = 0; j < n-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}

观察题目可知,条件成立必须是:
a[0][0] = a[1][1] = a[2][2] = ... = a[n][n];
a[0][1] = a[1][2] = ... = a[n-1][n];
同样也可以发现，a[0][n]和a[n][0]都只有一个。
所以可以得出规律，要使条件成立，必须有：
a[m][n] = a[m+1][n+1];
