// class Rectangle {
//     int l, b;

//     Rectangle(int l, int b) {
//         this.l = l;
//         this.b = b;
//     }

//     Rectangle(int l) {
//         this.l = l;
//         this.b = l;
//     }

//     void Display() {
//         System.out.println("Area = " + (l * b));
//         System.out.println("Perimeter = " + (2 * (l + b)));
//     }

//     public static void main(String[] args) {
//         Rectangle r = new Rectangle(10, 20);
//         Rectangle s = new Rectangle(10);
//         r.Display();
//         s.Display();
//     }

// }

class Student {
    String Name;
    int rollNo;
    int Age;

    Student() {
        Name = "Unknown";
        rollNo = 0;
        Age = 0;
    }

    Student(String Name, int rollNo, int Age) {
        this.Name = Name;
        this.rollNo = rollNo;
        this.Age = Age;
    }

    Student(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
        this.rollNo = 0;

    }

    void Dis() {
        System.out.println(Name);
        System.out.println(rollNo);
        System.out.println(Age);
    }

    public static void main(String[] args) {
        String Name = "abc";
        int rollNo = 10;
        int Age = 20;
        Student s = new Student();
        Student s1 = new Student(Name, rollNo, Age);
        Student s2 = new Student(Name, Age);
        s.Dis();
        s1.Dis();
        s2.Dis();
    }
}
