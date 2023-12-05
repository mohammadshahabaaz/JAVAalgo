package javaAlgo.isPalindrome8;

public class isPalindrome {
    public static Boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int number = 121;

        System.out.println("Output: " + isPalindrome(number));

    }
}
