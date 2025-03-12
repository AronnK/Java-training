public class reverseString {

    static int length(String str){
        int count = 0;
        for(int i : str.toCharArray()){
            count++;
        }
        return count;
    }

    static String reverse(String str){
        String result = "";
        for(int i = length(str) - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(length(str));
        System.out.println(reverse(str));
    }
}
