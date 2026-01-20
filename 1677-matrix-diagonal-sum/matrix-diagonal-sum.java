class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            sum += mat[i][left];
            if (left != right) {
                sum += mat[i][right];
            }
            left++;
            right--;
        }
        return sum;
    }
}
