package LeetCode;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Question58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
         return length;
    }
}
