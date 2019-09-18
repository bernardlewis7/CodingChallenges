/*
*
*Given an ASCII string, find the length of the longest substring without repeating characters.
*
*Example 1:
*
*Input: "abcabcbb"
*Output: 3 
*Explanation: The answer is "abc", with the length of 3. *
*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; 
        
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
