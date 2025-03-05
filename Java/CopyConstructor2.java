// class CopyConstructor {
//     int a, b, c;

//     CopyConstructor() {
//         a = 0;
//         b = 0;
//         c = 0;
//     }

//     CopyConstructor(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     CopyConstructor(CopyConstructor c1) {
//         this.a = c1.a;
//         this.b = c1.b;
//     }

//     void Disp() {
//         System.out.println(a + b);
//     }
// }

// class CopyConstructor2 {

//     public static void main(String[] args) {
//         int a = 5, b = 10;
//         CopyConstructor c1 = new CopyConstructor();
//         CopyConstructor c2 = new CopyConstructor(a, b);
//         CopyConstructor c3 = new CopyConstructor(c2);
//         c1.Disp();
//         c2.Disp();
//         c3.Disp();
//     }

// }  

// in C++ there is not need to define the default constructor, if you call the constructor without args it will automatically call default constructor, but in Java it wont happen automatically, so you have to define the default constructor for safety.

class CopyConstructor {
    int a, b, c;

    CopyConstructor() {
        a = 0;
        b = 0;
        c = 0;
    }

    CopyConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    CopyConstructor(CopyConstructor c1) {
        this.a = c1.a;
        this.b = c1.b;
    }

    void Disp() {
        System.out.println(a + b);
    }
}

class CopyConstructor2 {

    public static void main(String[] args) {
        int a = 5, b = 10;
        CopyConstructor c1 = new CopyConstructor();
        CopyConstructor c2 = new CopyConstructor(a, b);
        CopyConstructor c3 = new CopyConstructor(c2);
        c1.Disp();
        c2.Disp();
        c3.Disp();
    }

}
