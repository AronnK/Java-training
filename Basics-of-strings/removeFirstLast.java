public class removeFirstLast {
    public static String remFL(String S){
        return S.substring(1, S.length()-1);
    }
    public static void main(String[] args) {
        String S = "Hello World";
        System.out.println(remFL(S));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)   

