import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ret;

        int top = 0, left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse top row left → right
            for (int j = left; j <= right; j++) {
                ret.add(matrix[top][j]);
            }
            top++;

            // 2. Traverse right column top → bottom
            for (int i = top; i <= bottom; i++) {
                ret.add(matrix[i][right]);
            }
            right--;

            // 3. Traverse bottom row right → left, if still valid
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ret.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Traverse left column bottom → top, if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ret.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Solution obj = new Solution();
        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println(result);  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
