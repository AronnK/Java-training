public class MaxVowsInSubs {
    public static int kSubsMaxVows(String s, int k) {
        int maxVows = 0, currentVows = 0;
        int n = s.length();

        if (k > n) return 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) currentVows++;
        }
        maxVows = currentVows;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) currentVows++;
            if (isVowel(s.charAt(i - k))) currentVows--; 
            maxVows = Math.max(maxVows, currentVows);
        }

        return maxVows;
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(kSubsMaxVows("ArunKarthic", 7)); 
    }
}
