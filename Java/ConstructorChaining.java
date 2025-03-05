// public class ConstructorChaining {
//     ConstructorChaining() {
//         this(10);
//         System.out.println("Default");
//     }

//     ConstructorChaining(int x) {
//         this(2, 3);
//         System.out.println(
//                 "X value = " + x);
//     }

//     ConstructorChaining(int x, int y) {
//         this(10, 20, 30);
//         System.out.println(x + y);
//     }

//     ConstructorChaining(int x, int y, int  z){
//         System.out.printl n ( x +y+z);
//     }

//     public static void main(String[] args) {
//         ConstructorChaining c1 = new ConstructorChaining();
//     }
// }

public class ConstructorChaining {
    ConstructorChaining() {
        // this(10);
        System.out.println("Default");
    }

    ConstructorChaining(int x) {
        this(20, 3);
        System.out.println("X value = " + x);
    }

    ConstructorChaining(int x, int y) {
        this(10, 20, 30);
        System.out.println(x + y);
    }

    ConstructorChaining(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ConstructorChaining c1 = new ConstructorChaining(20, 30);
    }
}
// also applicable in different classes (inheritance)