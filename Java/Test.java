// import java.util.Scanner;

// class Test{
//     static int a,b,s=0;
//     static void Get(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first no: ");
//         a = sc.nextInt();
//         System.out.print("Enter the second no: ");
//         b = sc.nextnt();
//     }
//     static void Cal(){
//         s = a+b;
//     }
//     static void Dis(){
//         System.out.println(s);
//     }
//     public static void main(String[] args){
//         Get();
//         Cal();
//         Dis();
//     }
// }

import java.util.Scanner;

class Perfect {
    static int n, s = 0, i;

    static void Get(int x) {
        n = x;
        Cal();
    }

    static void Cal() {
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        Dis();
    }

    static void Dis() {
        System.out.println(n == s ? "Yup" : "Nope");
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        Perfect.Get(n);
        sc.close();
    }
}