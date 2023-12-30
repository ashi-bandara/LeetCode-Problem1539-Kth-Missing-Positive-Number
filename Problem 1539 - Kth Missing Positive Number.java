import java.util.Arrays;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] absentIntegers = new int[k + 1];
        int count = 0;

        for (int i = 1; count < k; i++) {
            if (Arrays.binarySearch(arr, i) < 0) {
                absentIntegers[count] = i;
                count++;
            }
        }

        return absentIntegers[k - 1];
    }
}