class Solution {

    static int helper(String s, int i, int sign, long num) {

        int n = s.length();
        if (i >= n || !Character.isDigit(s.charAt(i))) {
            return (int) (num * sign);
        }

        num = num * 10 + (s.charAt(i) - '0');

        if (num * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return helper(s, i + 1, sign, num);
    }

    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            }else{
                sign=1;
                i++;
            }
        }

        return helper(s, i, sign, num);
    }
}
