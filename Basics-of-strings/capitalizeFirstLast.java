public class capitalizeFirstLast {
    public static String capitalizeFL(String s){
        String[] s1 = s.split(" ",0);
        for(int i=0;i<s1.length;i++){
            s1[i] = s1[i].substring(0,1).toUpperCase() + s1[i].substring(1, s1[i].length()-1) + s1[i].substring(s1[i].length()-1).toUpperCase();
        }
        return String.join(" ",s1);
    }
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(capitalizeFL(s));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)   
