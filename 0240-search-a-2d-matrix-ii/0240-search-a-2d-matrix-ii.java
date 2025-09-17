class Solution {
    public boolean searchMatrix(int[][] a, int k) {
        int m = a.length, n = a[0].length;
        for(int i = 0; i < m; i++){
            if(k <= a[i][n - 1]){
                for(int j = 0; j < n; j++){
                    if(a[i][j] == k)
                    return true;
                    if(a[i][j] > k) break;
                }
            }
        }
        return false;
    }
}