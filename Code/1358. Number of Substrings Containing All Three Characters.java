1358. Number of Substrings Containing All Three Characters
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
--------------------------------------------------------------------------------------------------------------------------------
CODE:

class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            boolean hasA = false, hasB = false, hasC = false;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'a') hasA = true;
                if (s.charAt(j) == 'b') hasB = true;
                if (s.charAt(j) == 'c') hasC = true;
                if (hasA && hasB && hasC) count++;
            }
        }
        
        return count;
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
