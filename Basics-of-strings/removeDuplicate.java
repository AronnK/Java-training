public class removeDuplicate {
    static String remDup(String s){
        char[] res = new char[s.length()];
        int index = 0;
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            boolean found = false;
            for(int j = 0;j<index;j++){
                if(res[j] == x){
                    found = true;
                    break;
                }
            }
            if(!found){
                res[index++] = x;
                System.out.println("loop "+i+" "+String.valueOf(res));
            }
        }
        return new String(res,0,index); //starts from offset(0) to length(index), in the res array after the index the others are empty elements, so they're not included.
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(remDup(s));
        String a = remDup(s);
        System.out.println(a.length()); // So with offset and count, the lenght is 8 (only till non empty elements), without it the entire lenght of res array is changed to string (11), which also takes empty elements.
    } // For smaller strings like Hello World using offset and count might not seem necessary, but for larger strings it's better to use it.
}
// Time Complexity: O(n^2)
// Space Complexity: O(n)

/* Using HashSet */

// import java.util.HashSet;

// public class removeDuplicate {
//     static String remDup(String s) {
//         HashSet<Character> set = new HashSet<>();
//         StringBuilder sb = new StringBuilder();

//         for (char x : s.toCharArray()) {
//             if (set.add(x)) { // add() returns false if already present
//                 sb.append(x);
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(remDup(s)); // Output: Order not guaranteed
//     }
// }

// Time Complexity: O(n)
// Space Complexity: O(n)

// Where to Use HashSet?
// Removing Duplicates from a List
// Fast Membership Checking (like a lookup table)
// Storing Unique Elements in Large Data Sets
// Set Operations (Union, Intersection, Difference)

// Where to Use HashSet?
// If you need sorted data → Use TreeSet
// If you need to maintain insertion order → Use LinkedHashSet
// If you have concurrent access → Use ConcurrentHashMap.newKeySet()

/* Using LinkedHashSet */
// import java.util.LinkedHashSet;

// public class removeDuplicate {
//     static String remDup(String s) {
//         LinkedHashSet<Character> set = new LinkedHashSet<>();
//         StringBuilder sb = new StringBuilder();

//         for (char x : s.toCharArray()) {
//             if (set.add(x)) {
//                 sb.append(x);
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(remDup(s)); // Output: "Helo Wrd"
//     }
// }

// Time Complexity: O(n)
// Space Complexity: O(n)

// Where to Use LinkedHashSet?
// Maintains Insertion Order
// Allows Efficient Insertion and Removal Operations
// When you need to preserve the order of insertion

/* Using TreeSet */
// import java.util.TreeSet;

// public class removeDuplicate {
//     static String remDup(String s) {
//         TreeSet<Character> set = new TreeSet<>();
//         StringBuilder sb = new StringBuilder();

//         for (char x : s.toCharArray()) {
//             if (set.add(x)) {
//                 sb.append(x);
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(remDup(s));
//     }
// } // using treeset will give output as HWdelor, but since we are using stringbuilder, the output will be in the order of insertion.

// To get in alphabetically sorted order:
// import java.util.TreeSet;

// public class removeDuplicate {
//     static String remDup(String s) {
//         TreeSet<Character> set = new TreeSet<>(s.chars().mapToObj(c -> (char) c).toList());
//         StringBuilder sb = new StringBuilder();
//         for (char c : set) {
//             sb.append(c);
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(remDup(s)); // Output: " HWdellor" (sorted)
//     }
// }


// Time Complexity: O(n log n)
// Space Complexity: O(n)

// Where to Use TreeSet?
// Maintains Sorted Order
// When you need a sorted set of unique elements
