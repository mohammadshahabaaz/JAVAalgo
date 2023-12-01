// package javaAlgo.LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public int length(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        int length = s.length();

        while (right < length) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != c) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
                // right++; // Increment right to move the window forward
            }
        }

        return maxLength; // Return the calculated maxLength
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int result = solution.length(s);
        System.out.println(result); // Expected output for this input is 3
    }
}
