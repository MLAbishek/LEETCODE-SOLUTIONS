class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int i = 0, j = 0, ans = 0, diff;
        if (s.length() == 0)
            return 0;
        while (j < s.length()) {
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            while (freq.get(s.charAt(j)) > 1) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
            }
            j++;
            diff = j - i;
            if (diff > ans)
                ans = diff;

        }
        return ans;
    }
}