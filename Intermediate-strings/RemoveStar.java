public class RemoveStar {
   public static String remStarsAndLeft(String s){
    var arr = s.toCharArray();
    var l = 0;
    for(var r = 0; r<arr.length;r++){
        if(arr[r] == '*'){
            l--;
            // System.out.println("l when *: "+l);
        }else{
            arr[l] = arr[r];
            l++;
            // System.out.println("l when no *: "+l);
            // System.out.println("r when no *: "+r);
        }
    }
    return new String(arr,0,l);
   }
   public static void main(String[] args) {
    System.out.println(remStarsAndLeft("leet**cod*e"));
   } 
}
