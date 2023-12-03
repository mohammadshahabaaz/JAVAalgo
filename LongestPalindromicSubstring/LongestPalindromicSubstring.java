package javaAlgo.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "Empty string";
        }

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j);
                if (subStr.length() > longest.length() && isPalindrome(subStr)) {
                    longest = subStr;
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public static void main(String[] args) {

        String s = "ssmadam";

        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));

    }
}
