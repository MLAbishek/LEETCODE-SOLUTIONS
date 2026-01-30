class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long d = Math.abs((long) dividend);
        long n = Math.abs((long) divisor);

        int ans = 0;

        while (d >= n) {
            int count = 0;
            while (d >= (n << (count + 1))) {
                count++;
            }
            ans += (1 << count);
            d -= (n << count);
        }

        return sign ? ans : -ans;
    }
}
