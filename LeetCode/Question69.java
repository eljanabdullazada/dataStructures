package LeetCode;

import java.util.Scanner;

public class Question69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(mySqrt(number));
    }

    public static int mySqrt(int x) {
        if(x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if(square == x){
                return mid;
            }
            else if(square < x){
                result = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return result;
    }

}
