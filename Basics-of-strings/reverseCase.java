public class reverseCase {
    public static String reverseCase(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }else{
                result += Character.toUpperCase(ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseCase(str));
    }
}
