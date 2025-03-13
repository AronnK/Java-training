public class firstLast {
    public static void firstLastChar(String s){
        char f = s.charAt(0);
        char l = s.charAt(s.length()-1);
        System.out.println(f + " " + l);
    }
    public static void main(String[] args) {
        String s = "Hello World";
        firstLastChar(s);
    }
}
// Time Complexity: O(1)
// Space Complexity: O(1)

// public class firstLast {
//     static String firstLastChar(String s){
//         if(s.length() == 0){
//             return "-1";
//         }
//         return s.substring(0, 1) + s.substring(s.length() - 1);
//     }
//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(firstLastChar(s));
//     }
    
// }
// Time Complexity: O(n)
// Space Complexity: O(1)