class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length-1 && col >= 0) {
            int topLast = matrix[row][col];
            if(target == topLast) {
                return true;
            } else if(target > topLast) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
