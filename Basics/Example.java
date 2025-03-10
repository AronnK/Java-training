// import java.util.Scanner;

// class Fact {
//     static int a, f = 1;

//     static void Get() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no: ");
//         a = sc.nextInt();
//         calFact();
//     }

//     static void calFact() {
//         while (a > 0) {
//             f *= a;
//             a--;
//         }
//         Dis();
//     }

//     static void Dis() {
//         System.out.println(f);
//     }

//     public static void main(String[] args) {
//         Get();
//         // calFact();
//         // Dis();
//     }
// }

class Fact {
    int n, i, f = 1;

    void Get() {
        n = 6;
    }

    void Call() {
        while (n > 0) {
            f *= n;
            n--;
        }
    }

    void Dis() {
        System.out.println(f);
    }

    public static void main(String[] args) {
        Fact fa = new Fact();
        fa.Get();
        fa.Call();
        fa.Dis();
    }
}