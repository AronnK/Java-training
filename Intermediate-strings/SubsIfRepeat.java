import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsIfRepeat {
    public static List<String> kLengthSubs(String s, int k) {
        List<String> l = new ArrayList<>();
        if (s.length() < k) {
            return l;
        }
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));

            if (i - left + 1 == k) {
                String sub = s.substring(left, i + 1);
                if (!l.contains(sub)) {
                    l.add(sub);
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(kLengthSubs("abcabcab", 3));
    }
}
