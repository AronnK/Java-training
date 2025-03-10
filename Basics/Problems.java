public class Problems {
    // 5115 27
    // static void Cal(int n){
    // int temp = n;
    // boolean f = true;
    // while(temp>0){
    // if(n%(temp%10)!=0){
    // f = false;
    // }
    // temp/=10;
    // }
    // System.out.println(f ? "Yes" : "No");
    // }

    @SuppressWarnings("unused")
    int sum_of_digits(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    static boolean has_three(int n) {
        while (n > 0) {
            int a = n % 10;
            if (a == 3)
                return true;
            n /= 10;
        }
        return false;
    }

    static void no3(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!has_three(i))
                count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        no3(5);
        no3(14);
    }
}
