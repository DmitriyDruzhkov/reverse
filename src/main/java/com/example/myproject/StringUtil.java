package com.example.myproject;

public class StringUtil {

    private StringUtil(){
    }

    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
