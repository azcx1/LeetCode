class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0)
            return false;

        int reverse = 0;
        int tmp = x;

        while (tmp > 0) {
            int number = tmp % 10;
            reverse = reverse * 10 + number;
            tmp /= 10;
        }

        return x == reverse;
    }
}