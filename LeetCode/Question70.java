package LeetCode;

public class Question70 {
    public static void main(String[] args){
        int n = 5;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for(int i = 2; i <= n; i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;

    }
}
