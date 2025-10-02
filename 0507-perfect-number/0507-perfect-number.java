class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = sumDiv(num);
        if (num == sum)
            return true;
        return false;
    }

    private static int sumDiv(int n) {
        if (n == 0)
            return 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                ans += i;
            }
        }

        return ans;
    }
}