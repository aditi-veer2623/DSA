public class Solution {
    public int compress(char[] chars) {
        int write = 0, i = 0, n = chars.length;
        while (i < n) {
            char c = chars[i];
            int j = i;
            while (j < n && chars[j] == c) j++;
            int count = j - i;
            chars[write++] = c;
            if (count > 1) {
                for (char d : String.valueOf(count).toCharArray()) {
                    chars[write++] = d;
                }
            }
            i = j;
        }
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        Solution sol = new Solution();
        int newLen = sol.compress(chars);
        System.out.println("New length = " + newLen);
        System.out.print("Compressed array: ");
        for (int k = 0; k < newLen; k++) {
            System.out.print(chars[k] + " ");
        }
        // Expected output:
        // New length = 6
        // Compressed array: a 2 b 2 c 3 
    }
}
