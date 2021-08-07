package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;

        Set<Integer> row_zero = new HashSet<Integer>();
        Set<Integer> col_zero = new HashSet<Integer>();

        for(int i = 0; i < row_len; i++) {
            for(int j = 0; j < col_len; j++) {
                if(matrix[i][j] == 0) {
                    row_zero.add(i);
                    col_zero.add(j);
                }
            }
        }

        for(int i = 0; i < row_len; i++) {
            for(int j = 0; j < col_len; j++) {
                if(row_zero.contains(i) || col_zero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
