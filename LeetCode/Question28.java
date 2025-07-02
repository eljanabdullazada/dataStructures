package LeetCode;

import java.util.Scanner;

public class Question28 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string for haystack: ");
        String haystack = scanner.nextLine();
        System.out.println("Please enter a string for needle: ");
        String needle = scanner.nextLine();

        int indexOfTheSubstring = strStr(haystack, needle);
        System.out.println("The index of the substring is " + indexOfTheSubstring);
    }

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if(nLen == 0) return 0;
        if(nLen > hLen) return -1;

        for(int i = 0; i <= hLen - nLen; i++){
            if(haystack.substring(i, i + nLen).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
