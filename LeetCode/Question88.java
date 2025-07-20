package LeetCode;

import java.util.Arrays;

public class Question88 {
    public static void main(String[] args){
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.println("Before merge: " + Arrays.toString(nums1));
        merge(nums1, m, nums2, n);
        System.out.println("After merge: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt = 0;
        for(int i = m; i < m + n; i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[cnt];
                cnt++;
            }
        }
        Arrays.sort(nums1);
    }
}
