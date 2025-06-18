package abc;

import java.util.*;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring without repeating characters length: " +
                           lengthOfLongestSubstring(s));
    }
}

