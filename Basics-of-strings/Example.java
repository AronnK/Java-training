
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

class Example{
    public static void main(String[] args) {
        String s1 = "Java is boring";
        System.out.println(s1.startsWith("Java"));
        System.err.println(s1.startsWith("J", 0));
        System.out.println(s1.startsWith("Java", 0));
        System.out.println(s1.startsWith("a", 0));
        System.out.println(s1.startsWith("is", 5)); 
        System.out.println(s1.endsWith("g"));

    }
}

