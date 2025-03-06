// When a method in a subclass has the same name and type signature as a method in its superclass, 
// then the method in the subclass is said to override the method in the superclass.

// When an overidden method is called from within its subclass,
// it will always refer to the version of the method defined by the subclass.

// The version of the method defined by the superclass will be ridden.

// MOL - same classname different signature.
// Method over riding - same classname same signature.

// class Base {
//     void Dis() {
//         System.out.println("Base class.");
//     }
// }

// class Child extends Base {
//     // void Dis() {
//     // System.out.println("Derived class.");
//     // }

//     void Dis2(
//    System.out.println("2"); // So in MOL we differentiate the methods using diff args,
//     }                            // here the diff is done with child class itself...
// }                               // If child class has the invoked method, it will be overriden and executed, 
//                                // if not the parent class' method will be executed.
// class MOR {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.Dis();
//         c.Dis2();
//     }
// }

// class One {
//     int a, b;

//     One(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     void Sum() {
//         System.out.println(a + b);
//     }
// }

// class Two extends One {
//     int c;

//     Two(int a, int b, int c) {
//         super(a, b);
//         this.c = c;

//     }

//     void Sum() {
//         System.out.println(a + b + c);
//     }
// }

// class MOR {
//     public static void main(String[] args) {
//         Two t = new Two(1, 2, 3);
//         t.Sum();
//         One o = new ne  (1,2);
//         o.Sum();

//     }
// }

// To access the super class version of an overridden method by using super
// keyword

// MOR occurs only when the name and the type signatures
// of the two methods are identical, if not,
// then the 2 methods are overloaded.

// class Shape {
//     void Cal() {
//         System.out.println("Area not defined.");
//     }
// }

// class Circle extends Shape {
//     double r;

//     Circle(double r) {
//         this.r = r;
//     }

//     @Override
//     void Cal() {
//         System.out.println(3.14 * r * r);
//     }
// }

// class Rectangle extends Shape {
// int l, b;

//     Rectangle(int l, int b) {

//         this.l = l;
//         this.b = b;
//     }
//     @Override
//     void Cal() { // if i pass Cal(int l, int b), this will become MOL.
//         System.out.println(l * b);
//     }
// }


// @SuppressWarnings("unused")
// class MOR {
//     public static void main(String[] args) {
//         Circle c = new Circle(5);
//         c.Cal();
//         Rectangle r = new Rectangle(1, 2);
//          r.Cal();
//          Shape s = new Shape();
//         s.Cal();
//     }
// }

// class MOR{
//     public static void main(String [] args){
//     Bank e = new Bank(1000);
//     Savings m = new Savings(1000);
//     Fixed d = new Fixed(1000);
//     System.out.println("Interest : " + e.cal());
//     System.out.println("Savings interest : " + m.cal());
//     System.out.println("FD interest : " + d.cal());
//     }
// }

// class Bank{
//     double principal;
//     Bank(double principal){
//         this.principal = principal;
//     }
//     double cal(){
//         return 0.05*principal;
//     }
// }

// class Savings extends Bank{
//     double principal;
//     Savings(double principal){
//         this.principal = principal;
//     }

//     double cal(){
//         return (0.04*principal);
//     }
// }

// class Fixed extends Bank{
//     double principal;
//     Fixed(double principal) {
//         this.principal = principal;
//     }
    
//     double cal(){
//         return 0.09*principal;
//     }
// }

class MOR{
    public static void main(String [] args){
    Employee e = new Employee();
    Manager m = new Manager(1000);
    Developer d = new Developer(160);
    System.out.println("Employee Salary : " + e.cal());
    System.out.println("Manager Salary : " + m.cal());
    System.out.println("Developer Salary : " + d.cal());
    }
}

class Employee{

    int cal(){
        return 2000;
    }
}

class Manager extends Employee{
    int bonus;
    Manager(int bonus){
        this.bonus = bonus;
    }

    int cal(){
        return 2000 + bonus;
    }
}

class Developer extends Employee{
    int hr;
    public Developer(int hr) {
        this.hr = hr*50;
    }
    
    int cal(){
        return 2000 + hr;
    }
}

