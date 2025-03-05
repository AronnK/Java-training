// class MOL {
//     static void Area(double r) {
//         System.out.println(3.14 * r * r);
//     }

//     static void Area(int a) {
//         System.out.println(a * a);
//     }

//     static void Area(int a, int b) {
//         System.out.println(a * b);
//     }

//     static void Area(int a, int b, char c) {
//         System.out.println(a * b);
//     } // char c is only for differentiating this function from the one above it, it
//       // wont be used inside the function... Dummy variable (written by Ak, not
//       // chatgpt, practiced by Ak only!)

//     static void Area(double b, double h) {
//         System.out.println(0.5 * b * h);
//     }

//     public static void main(String[] args) {
//         Area(6.0);
//         Area(6);
//         Area(6, 7);
//         Area(6, 7, 'a');
//         Area(6.0, 7.0);
//     }
// }

class MOL {
    void Area(double r) {
        System.out.println(3.14 * r * r);
    }

    void Area(int a) {
        System.out.println(a * a);
    }

    void Area(int a, int b) {
        System.out.println(a * b);
    }

    void Area(int a, int b, char c) {
        System.out.println(a * b);
    }

    void Area(double b, double h) {
        System.out.println(0.5 * b * h);
    }

    public static void main(String[] args) {
        MOL e = new MOL();
        e.Area(6.0);
        e.Area(7.0f); // float is given here, but the func is expecting double args, yet its working,
                      // cuz of TYPE PROMOTION;
        e.Area(6);
        e.Area(6, 7);
        e.Area(6, 7, 'a');
        e.Area(6.0, 7.0);
    } // main method can be overloaded, non static main method cannot be overloaded
}
// int add (int a) and double add (int a) looks like it might work but dif in
// return type isnt enuf, the args must be diff
// MOL - same classname different signature.
// Method over riding - same classname same signature.