
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

// class Example{
//     public static void main(String[] args) {

//         String s1 = "Java is boring";
//         // char ch = sc.next().charAt(0);
//         // System.out.println(ch);
//         System.out.println(s1.indexOf("J"));
//         System.out.println(s1.indexOf("is"));
//         System.out.println(s1.indexOf("is", 5));
//         System.out.println(s1.lastIndexOf("is"));
//         System.out.println(s1.lastIndexOf("a", 2)); // 1 from 2 a last is at 1.
//         System.out.println(s1.lastIndexOf("a", 5)); // 3 from 5 a last is at 3.
//         System.out.println(s1.lastIndexOf("g", 13)); // 1 so basically lastIndexOf is also finding the first occurence of the character from the end of the string (in reverse). 
//         System.out.println(s1.lastIndexOf("g", 0)); // -1 so here from 0 there is no g, but from 13 g is at 13.
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "I";
//         String s2 = "Like";
//         String s3 = "Java";
//         String s4 = "Programming";
//         System.out.println(String.join(" ", s1, s2, s3, s4));

//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = "";
//         String s3;
//         System.out.println(s1.isEmpty());
//         System.out.println(s2.isEmpty());
//         System.out.println(s3.isEmpty()); // A non initialized string is not an empty string, using isEmpty() will return error.
//     }
// }

// class Example{
//          static void checkNull(String s){
//             if(s == null){
//                 System.out.println("String is null");
//             }
//             else if(s.isEmpty()){
//                 System.out.println("String is empty");
//             }
//             else{
//                 System.out.println("String is not null or empty");
//             }
//         }
//         public static void main(String[] args) {
//             String s1 = null;
//             checkNull(s1);
//             String s2 = "";
//             checkNull(s2);
//             String s3 = "Hello";
//             checkNull(s3);
//         }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = new String("Hello");
//         System.out.println(s1 == s2);
//         String s3 = "Hello";
//         System.out.println(s1 == s3);
//         String s4 = s2.intern();
//         System.out.println(s1 == s4);
//         System.out.println(s2 == s4);
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Java programming";
//         String str2 = s1.substring(0, 4); // uses start index (specifies the index where the subs will begin) and end index (specifies the index where the subs will stop) (0 to 3).
//         System.out.println(str2);
//         String str3 = s1.substring(5); // uses start index and goes to end of the string.
//         System.out.println(str3);
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Java programming";
//         System.out.println(s1.contains("Java"));
//         String s2 = "Java";
//         System.out.println(s1.contains(s2));
//         String s3 = "java";
//         System.out.println(s1.contains(s3)); 
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String regex = "^J..a$"; // ^ is the start of the string, . is any character and the no of . indicates the no of characters, a is the end of the string.
//         String s1 = "Java";
//         System.out.println(s1.matches(regex));
//         String s2 = "Jbca";
//         System.out.println(s2.matches(regex));
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Java";
//         String s2 = "Java";
//         String s3 = "java";
//         String s4 = "JAVA";
//         System.out.println(s1.compareTo(s2));
//         System.out.println(s1.compareTo(s3));
//         System.out.println(s1.compareTo(s4));
//         System.out.println(s1.compareToIgnoreCase(s2));
//         System.out.println(s1.compareToIgnoreCase(s3));
//         System.out.println(s1.compareToIgnoreCase(s4));
//         String s5 = "Hello";
//         System.out.println(s1.compareTo(s5));
//         System.out.println(s1.compareToIgnoreCase(s5));
//         String s6 = "abc";
//         System.out.println(s1.compareTo(s6));
//         System.out.println(s1.compareToIgnoreCase(s6));
//         String first = "Hello";
//         String second = "hello";
//         if(first.compareTo(second) == 0){
//             System.out.println("Strings are equal");
//         }
//         else if(first.compareTo(second) > 0){
//             System.out.println("String first is greater than String second");
//         }
//         else{
//             System.out.println("String first is less than String second");
//         }
//         if(first.compareToIgnoreCase(second) == 0){
//             System.out.println("Given strings are equal");
//         }
//         else if(first.compareTo(second) > 0){
//             System.out.println("String first is greater than String second");
//         }
//         else{
//             System.out.println("String first is less than String second");
//         }
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "Hello world. Hello world. Hello world.";
//         String s2 = s1.replace("l", "w");
//         System.out.println(s2);
//         System.out.println(s1.replace("Hello", "Hi"));
//         System.out.println(s1.replaceFirst("Hello", "Hi"));


//         String s3 = "aabbaaccdd";
//         String s4 = "@java1234java456@";
//         String regex = "\\d+"; // replaces all the digits with a space.
//         System.out.println(s3.replaceFirst("aa", "zz"));
//         System.out.println(s4.replaceFirst(regex, " "));
//         String s5 = "a+a-++b";
//         System.out.println(s5.replaceFirst("\\+", "#"));

//         System.out.println(s5.replaceAll("\\+", "#"));
//         // replace() replaces the target char/charsequence but replaceAll() replaces the regex.
//     }
// }

// class Example{
//     public static void main(String[] args) {
//         String s1 = "     Hello world    ";
//         System.out.println(s1);
//         System.out.println(s1.trim()); // gives the left justified string.
//     }
// }

import java.util.Arrays;

class Example{
    public static void main(String[] args) {
        String s1 = "Hello world welcome to java .";
        String[] arr = s1.split(" ");
        System.out.println(Arrays.toString(arr));
        for (String i : arr) {
            System.out.println(i);
        }
        String s2 = "AB::CD::EF::GH:IJ";
        String[] arr2 = s2.split("::");
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = s2.split("::",3);
        System.out.println(Arrays.toString(arr3));
    }
} 



