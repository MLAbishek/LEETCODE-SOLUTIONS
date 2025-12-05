class Solution {
    // static final int INT_MAX=2147483648;
    // static final int INT_MIN=-2147483648;
    private static int helper(String s, int i, long ans, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * ans);

        }
        int val = s.charAt(i) - '0';
        if (sign == 1) {
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && val > 7))
                return Integer.MAX_VALUE;
        } else {
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && val > 8))
                return Integer.MIN_VALUE;
        }
        ans = (ans * 10) + val;
        return helper(s, i + 1, ans, sign);
    }

    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        int sign = 1;
        if(i>=s.length()) return 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-')
                sign = sign * -1;
            i++;
        }

        return helper(s, i, 0, sign);

    }
}