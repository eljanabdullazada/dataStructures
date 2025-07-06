package LeetCode;

import java.util.Arrays;

public class Question66 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,9,3};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

