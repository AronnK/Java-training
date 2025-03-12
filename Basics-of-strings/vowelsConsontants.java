public class vowelsConsontants {
    static int[] countVowelsConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        String str1 =  str.toLowerCase();
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }   

    public static void main(String[] args) {
        String str = "HEllO World";
        int[] result = countVowelsConsonants(str);
        System.out.println("Number of vowels: " + result[0] + " Number of consonants: " + result[1]);
    }
}
