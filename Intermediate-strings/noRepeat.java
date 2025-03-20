
import java.util.HashSet;

public class noRepeat {
    public static int longSubs(String s){
        int n = s.length();
        int maxLen = 0;
        int l = 0; //left pointer
        HashSet<Character> set = new HashSet<>();
        for(int r=0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                System.out.println("set while removing:"+set);
                System.out.println("l while removing:"+l);
                System.out.println("r while removing:"+r);
            }
            set.add(s.charAt(r));
            System.out.println("set while adding:"+set);
            System.out.println("maxlen while adding:"+maxLen);
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longSubs("abcdeabcdefg"));
    }
}
