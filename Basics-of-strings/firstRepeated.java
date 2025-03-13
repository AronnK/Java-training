public class firstRepeated {
    static String firstRepChar(String s){
        String s1 = s.toLowerCase().replaceAll("[^a-z]", "");
        int freq[] = new int[26];
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(freq[ch-'a']>0){
                return String.valueOf(ch);
            }
            freq[ch-'a']++;
        }
        return "-1";
    }
    public static void main(String[] args) {
        String s = "Helo Wrrrld";
        System.out.println(firstRepChar(s));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

