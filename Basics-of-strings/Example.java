
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         int len = s1.length();
//         System.out.println(len);
//     }
// }

// import java.util.Scanner;
//  class Example{
//     public static void main(String[] args) {
//         String s1;
//         Scanner sc = new Scanner(System.in);
//         int start, end, target;
//         System.out.println("Enter the string: ");
//         s1 = sc.nextLine();
//         System.out.println("Enter the start index: ");
//         start = sc.nextInt();
//         System.out.println("Enter the end index: ");
//         end = sc.nextInt();
//         System.out.println("Enter the target character: ");
//         target = sc.nextInt();

//         char result[] = new char[end-start+1];
//         s1.getChars(start, end, result, target); // srcBegin, srcEnd, dst, dstBegin.
//         System.out.println(result);
//         sc.close();
//     }
//  }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "abcdABCD";
//         byte [] result = s1.getBytes();
//         System.out.println(Arrays.toString(result));
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = "Hello";
//         System.out.println(s1.equals(s2));
//         String s3 = "hello";
//         System.out.println(s1.equals(s3));
//         System.out.println(s1.equalsIgnoreCase(s3));
//         String s4 = "Helloww";
//         System.out.println(s1.equalsIgnoreCase(s4));
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = "llo";
//         System.out.println(s1.regionMatches(2, s2, 0, 3)); // start index of s1, start index of s2, length.
//         String s3 = "LLO";
//         System.out.println(s1.regionMatches(2, s3, 0, 3)); // ignore case default is false.
//         System.out.println(s1.regionMatches(true, 2, s3, 0, 3)); // ignore case, start index of s1, start index of s2, length.
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Java is boring";
//         System.out.println(s1.startsWith("Java"));
//         System.err.println(s1.startsWith("J", 0));
//         System.out.println(s1.startsWith("Java", 0));
//         System.out.println(s1.startsWith("a", 0));
//         System.out.println(s1.startsWith("is", 5)); 
//         System.out.println(s1.endsWith("g"));

//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Java is boring";
//         int index = s1.indexOf("is");
//         System.out.println(index);
//         int index2 = s1.indexOf("is", 1);
//         System.out.println(index2);
//         int index3 = s1.lastIndexOf("is");
//         System.out.println(index3);       
//     }
// }

class Example{
    public static void main(String[] args) {

        String s1 = "Java is boring";
        // char ch = sc.next().charAt(0);
        // System.out.println(ch);
        System.out.println(s1.indexOf("J"));
        System.out.println(s1.indexOf("is"));
        System.out.println(s1.indexOf("is", 5));
        System.out.println(s1.lastIndexOf("is"));
        System.out.println(s1.lastIndexOf("a", 2)); // 1 from 2 a last is at 1.
        System.out.println(s1.lastIndexOf("a", 5)); // 3 from 5 a last is at 3.
        System.out.println(s1.lastIndexOf("g", 13)); // 1 so basically lastIndexOf is also finding the first occurence of the character from the end of the string (in reverse). 
        System.out.println(s1.lastIndexOf("g", 0)); // -1 so here from 0 there is no g, but from 13 g is at 13.
    }
}
