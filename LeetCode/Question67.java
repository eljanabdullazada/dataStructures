package LeetCode;

import java.util.Scanner;

class Question67 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first binary string: ");
        String a = sc.next();
        System.out.println("Please enter the second binary string: ");
        String b = sc.next();
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){

            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;

            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.reverse().toString();

    }
}
