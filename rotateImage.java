class Solution {
    public void rotate(int[][] matrix) {
        int min = 0;
        int max = matrix.length - 1;
        while (max > min) {
            for (int i=0; min+i<max; i++) {
                int myNum = matrix[min][min+i];
                matrix[min][min+i] = matrix[max-i][min];
                matrix[max-i][min] = matrix[max][max-i];
                matrix[max][max-i] = matrix[min+i][max];
                matrix[min+i][max] = myNum;
            }
            min++;
            max--;
        }
    }
}
