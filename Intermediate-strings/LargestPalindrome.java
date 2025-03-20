public class LargestPalindrome {

    public static int LongestPalindromeLength(String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxLength = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1; 

                if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = true;
                    maxLength = length;
                }
            }
        }return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(LongestPalindromeLength("abcdedcbaaiaidn"));
    }
}
