// Interfaces are syntactically similar to class, which are used for multiple inheritance.
// Only structure (declaration), no definition or instance variable.
// Lack of instance variable and their methods are declared without any body.
// Any number of classes can implement an interface that is defined, one class can implement any number of interfaces too.
// A class must create the complete set of methods defined by the interface.
// **Interfaces support dynamic method reservation at runtime**.
// Interface is a partially implemented class.

/* Syntax for interface

    access interfacename{

        return type method - name1(parameter list);
        return type method - name2(parameter list);
        ...
        return type method - namen(parameter list);

        type final-variable1 = value;
        type final-variable2 = value;
        ...
        type final-variablen = value;
    }

*/ 

// **I can define any variable inside the interface, it just have to be implicitly final(can not modify) and static**.
// Can not be changed by the implementing class (final - can not change, static - only one copy no matter how many times used).
// The final var must be initialised.
// All methods and variables are implicitly public.
// Can only create reference for interface, can't create object.

// interface Arith{
//     void Add(int x, int y);
//     void Sub(int x, int y);
//     void Mul(int x, int y);
//     void Div(int x, int y);
//     void Mod(int x, int y);
// }

// class Interface implements Arith{
//     @Override
//     public void Add(int x, int y){
//         System.out.println(x+y);
//     }
//     @Override
//     public void Sub(int x, int y){
//         System.out.println(x-y);
//     }
//     @Override
//     public void Mul(int x, int y){
//         System.out.println(x*y);
//     }
//     @Override
//     public void Div(int x, int y){
//         System.out.println(x/y);
//     }
//     @Override
//     public void Mod(int x, int y){
//         System.out.println(x%y);
//     }

//     public static void main(String[] args){
//         Interface a = new Interface();
//         a.Add(5,6);
//         a.Sub(6,5);
//         a.Mul(5,6);
//         a.Div(6,5);
//         a.Mod(66,55);
//     }
// }

/*  Accessing Interface through interface reference */

// interface AreaCalculation{
//     void Cal();
// }
// class Circle implements AreaCalculation{
//     double r;
//     Circle(double r){
//         this.r = r;
//     }
//     @Override
//     public void Cal(){
//         System.out.println(3.14*r*r);
//     }
// }

// class Square implements AreaCalculation{
//     int r;
//     Square(int r){
//         this.r = r;
//     }
//     @Override
//     public void Cal(){
//         System.out.println(r*r);
//     }
// }

// class Rectangle implements AreaCalculation{
//     int r,b;
//     Rectangle(int r, int b){
//         this.r = r;
//         this.b = b;
//     }
//     @Override
//     public void Cal(){
//         System.out.println(b*r);
//     }
// }

// class Triangle implements AreaCalculation{
//     int r,b;
//     Triangle(int r, int b){
//         this.r = r;
//         this.b = b;
//     }
//     @Override
//     public void Cal(){
//         System.out.println(0.5*b*r);
//     }
// }

// @SuppressWarnings("unused")
// class Interface{
//     public static void main(String[] args) {
//         Circle c = new Circle(5.0);
//         Square s = new Square(5);
//         Rectangle r = new Rectangle(5,6);
//         Triangle t = new Triangle(5,6);
//         AreaCalculation ref;
//         ref = c;
//         ref.Cal();
//         ref = s;
//         ref.Cal();
//         ref = r;
//         ref.Cal();
//         ref = t;
//         ref.Cal();
//     }
// }

/* Partial implementation */

// interface Arith{
//     void Add(int x, int y);
//     void Sub(int x, int y);
//     void Mul(int x, int y);
//     void Div(int x, int y);;
// }

// class One implements Arith{
//     @Override
//     public void Add(int x, int y){
//         System.out.println(x+y);
//     }
//     @Override
//     public void Sub(int x, int y){
//         System.out.println(x-y);
//     }
//     @Override
//     public void Mul(int x, int y){
       
//     }
//     @Override
//     public void Div(int x, int y){
        
//     }

// }
// class Two implements Arith{
//     @Override
//     public void Add(int x, int y){
        
//     }
//     @Override
//     public void Sub(int x, int y){
       
//     }
//     @Override
//     public void Mul(int x, int y){
//         System.out.println(x*y);
//     }
//     @Override
//     public void Div(int x, int y){
//         System.out.println(x/y);
//     }
// }

// @SuppressWarnings("unused")
// class Interface{
//     public static void main(String[] args){
//         One o = new One();
//         o.Add(5,6);
//         o.Sub(6,5);
//         Two t = new Two();
//         t.Mul(5,6);
//         t.Div(6,5);
        
//     }
// }

/* Some type of Interface */

// interface AS{
//     void Add(int x, int y);
//     void Sub(int x, int y);
// }

// interface MD{
//     void Mul(int x, int y);
//     void Div(int x, int y);
//     void Mod(int x, int y);
// }


// class Interface implements AS, MD{
//     @Override
//     public void Add(int x, int y){
//         System.out.println(x+y);
//     }
//     @Override
//     public void Sub(int x, int y){
//         System.out.println(x-y);
//     }
//     @Override
//     public void Mul(int x, int y){
//         System.out.println(x*y);
//     }
//     @Override
//     public void Div(int x, int y){
//         System.out.println(x/y);
//     }
//     @Override
//     public void Mod(int x, int y){
//         System.out.println(x%y);
//     }

//     public static void main(String[] args){
//         Interface a = new Interface();
//         a.Add(5,6);
//         a.Sub(6,5);
//         a.Mul(5,6);
//         a.Div(6,5);
//         a.Mod(66,55);
//     }
// }

/* Nested Interface */

// class Interface{
//     interface i1{
//         void Dis();
//     }
//     class Inner implements i1{
//         @Override
//         public void Dis(){
//             System.out.println("Nested interfae");
//         }
//     }
//     public static void main(String[] args) {
//         Interface outerInterface = new Interface();
//         Interface.Inner innerInterface = outerInterface.new Inner();
//         innerInterface.Dis();
//     }
// }

/* Extending Interface */

// interface I1{
//     void Add(int x, int y);
//     void Sub(int x, int y);
// }
// interface I2 extends I1{
//     void Mul(int x, int y);
//     void Div(int x, int y);
// }
// class Interface implements I2{
//         @Override
//     public void Add(int x, int y){
//         System.out.println(x+y);
//     }
//     @Override
//     public void Sub(int x, int y){
//         System.out.println(x-y);
//     }
//     @Override
//     public void Mul(int x, int y){
//         System.out.println(x*y);
//     }
//     @Override
//     public void Div(int x, int y){
//         System.out.println(x/y);
//     }
//     public static void main(String[] args) {
//         Interface i = new Interface();
//         i.Add(2, 5);
//         i.Sub(5, 4);
//     }
// }

/* Problems */

// Problem 1:
// interface Vehicle{
//     void start();
//     void stop();
//     int fuelEff();
// }
// class Car implements Vehicle{
//     @Override
//     public void start(){
//         System.out.println("Car started.");
//     }
//     @Override
//     public void stop(){
//         System.out.println("Car stopped.");
//     }
//     @Override
//     public int fuelEff(){
//         return 30;
//     }
// }
// class Truck implements Vehicle{
//     @Override
//     public void start(){
//         System.out.println("Truck started.");
//     }
//     @Override
//     public void stop(){
//         System.out.println("Truck stopped.");
//     }
//     @Override
//     public int fuelEff(){
//         return 15;
//     }
// }

// @SuppressWarnings("unused")
// class Interface{
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.start();
//         System.out.println("Fuel eff of car = " + c.fuelEff());
//         c.stop();
//         Truck t = new Truck();
//         t.start();
//         System.out.println("Fuel eff of truck = " + t.fuelEff());
//         t.stop();
//     }
// }

// Problem 2:
// interface I1{
//     void Circle(double r);
//     void Square(int s);
// }
// interface I2 extends I1{
//     void Rectangle(int l, int b);
//     void Triangle(int l, int b);
// }
// class Interface implements I2{
//         @Override
//     public void Circle(double r){
//         System.out.println(3.14*r*r);
//     }
//     @Override
//     public void Square(int s){
//         System.out.println(s*s);
//     }
//     @Override
//     public void Rectangle(int l, int b){
//         System.out.println(l*b);
//     }
//     @Override
//     public void Triangle(int x, int y){
//         System.out.println(x*0.5*y);
//     }
//     public static void main(String[] args) {
//         Interface i = new Interface();
//         i.Circle(5);
//         i.Square(5);
//         i.Rectangle(5, 6);
//         i.Triangle(5, 6);
//     }
// }

// Problem 3:
interface Emp{
    String getName();
    double getSalary();
}

class Interface implements Emp{
    String name; double salary;
    Interface(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Interface i = new Interface("Adithya", 75846921);
        System.out.println(i.getName());
        System.out.println(String.valueOf(i.getSalary()));

    }
}