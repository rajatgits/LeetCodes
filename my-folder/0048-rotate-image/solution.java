class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++) {
            for(int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
           int temp = arr[l];
           arr[l] = arr[r];
           arr[r] = temp;
           l++;
           r--;
        }
    }
}
