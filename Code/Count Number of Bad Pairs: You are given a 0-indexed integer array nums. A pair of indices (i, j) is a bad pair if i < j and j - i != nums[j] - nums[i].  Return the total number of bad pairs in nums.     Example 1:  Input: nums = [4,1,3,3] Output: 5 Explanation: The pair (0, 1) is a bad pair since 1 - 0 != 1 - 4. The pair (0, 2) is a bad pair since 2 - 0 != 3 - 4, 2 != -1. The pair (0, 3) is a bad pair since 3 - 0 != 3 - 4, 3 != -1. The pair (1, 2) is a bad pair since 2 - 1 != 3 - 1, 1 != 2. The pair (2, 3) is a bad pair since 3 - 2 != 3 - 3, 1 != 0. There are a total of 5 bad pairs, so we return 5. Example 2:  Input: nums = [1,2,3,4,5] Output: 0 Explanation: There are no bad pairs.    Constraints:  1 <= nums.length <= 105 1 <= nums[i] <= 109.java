import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2; // Total pairs possible
        
        Map<Integer, Long> freq = new HashMap<>();
        long goodPairs = 0;
        
        for (int i = 0; i < n; i++) {
            int val = nums[i] - i;
            if (freq.containsKey(val)) {
                goodPairs += freq.get(val); // Add count of previous occurrences
            }
            freq.put(val, freq.getOrDefault(val, 0L) + 1);
        }
        
        return totalPairs - goodPairs;
    }
}
