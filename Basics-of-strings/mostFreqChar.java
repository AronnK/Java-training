// public class mostFreqChar {
//      static char mostFreq(String s){
//         int freq[] = new int[256]; // Assuming ASCII characters, 256 is the total number of characters in ASCII.
//         for(int i = 0;i<s.length();i++){
//             freq[s.charAt(i)]++; // s.charAt(i) returns the character at index i, freq[] is int, so even if it's a char, it's converted to int.
//         } // For eg: a will be converted to 97, b to 98, etc, and in freq array, at the 97th index, 1 will be added for every 'a' present in the string.
//         int max = 0;
//         char maxChar = ' ';
//         for(int i = 0;i<256;i++){
//             if(freq[i]>max){
//                 max = freq[i];
//                 maxChar = (char)i;
//             }
//         }
//         return maxChar;
//     }
//     public static void main(String[] args) {
//         String s = "Hello Worrrrrrrrld";
//         System.out.println(mostFreq(s));
//     }
// }
// Time Complexity: O(n)
// Space Complexity: O(1)

// But we are allocating space for characters that arent present in the string, so we can use hashmap to store the frequency of characters.

// import java.util.HashMap;

// public class mostFreqChar {
//     static char mostFreq(String s) {
//         HashMap<Character, Integer> freqMap = new HashMap<>();
//         char maxChar = ' ';
//         int maxFreq = 0;

//         for (char c : s.toCharArray()) {
//             int freq = freqMap.getOrDefault(c, 0) + 1; //get or default, if present get it, if not initialize it to 0 and add 1.
//             freqMap.put(c, freq);

//             if (freq > maxFreq) {  // Update max character during the first pass itself
//                 maxFreq = freq;
//                 maxChar = c;
//             }
//         }
//         return maxChar;
//     }

//     public static void main(String[] args) {
//         String s = "Hello Worrrrrrrrld";
//         System.out.println(mostFreq(s));  // Output: 'r'
//     }
// }
// Time Complexity: O(n)
// Space Complexity: O(n)

// So eventhough the hashmap might seem like the better solution, it's not. 
// Because O(1) (Fixed 256 integers) in the first method whereas in hashmap method O(n) (Depends on input size).
// And first sol is faster (Direct array indexing) but the second sol is slower (Hash lookups, object overhead).

// The most optimized way to find the most frequent character in a string depends on the constraints:

// If we assume only ASCII characters (0-255) → Use an array of size 256 (int[256]) (fastest, O(1) space).
// If we need to handle Unicode characters → Use a HashMap<Character, Integer> (slightly slower, O(n) space).


public class mostFreqChar {
    static char mostFreq(String s){
       int freq[] = new int[256]; // Assuming ASCII characters, 256 is the total number of characters in ASCII.
       for(int i = 0;i<s.length();i++){
           freq[s.charAt(i)]++; // s.charAt(i) returns the character at index i, freq[] is int, so even if it's a char, it's converted to int.
       } // For eg: a will be converted to 97, b to 98, etc, and in freq array, at the 97th index, 1 will be added for every 'a' present in the string.
       int max = 0;
       char maxChar = ' ';
       for(int i = 0;i<256;i++){

        if(freq[i]>1){
            return maxChar;
        }

           if(freq[i]>max){
               max = freq[i];
               maxChar = (char)i;
           }
       }
       return maxChar;
   }
   public static void main(String[] args) {
       String s = "HHello Worrrrrrrrld";
       System.out.println(mostFreq(s));
   }
}