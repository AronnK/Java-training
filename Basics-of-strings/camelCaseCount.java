public class camelCaseCount {
    public static int camelCase(String s){
        int count = 0;
        for(char x : s.toCharArray()){
            if(x>'A' && x<'Z'){
                count++;
            }
        }
        return count;
    }   
    public static void main(String[] args) {
        String s = "WELcome";
        System.out.println(camelCase(s));
    }
}
