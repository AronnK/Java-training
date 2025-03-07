// Why dynamic method dispatch is needed:

// You can decide the implementation at runtime (e.g., based on user input, configuration, etc.).
// You don’t need to rewrite the payment processing logic for each gateway.

// abstract class PaymentGateway {
//     abstract void processPayment(double amount);
// }

// class PayPal extends PaymentGateway {
//     @Override
//     void processPayment(double amount) {
//         System.out.println("Processing PayPal payment: $" + amount);
//     }
// }

// class Stripe extends PaymentGateway {
//     @Override
//     void processPayment(double amount) {
//         System.out.println("Processing Stripe payment: $" + amount);
//     }
// }
// public class DynamicMethodDispatch {
//     public static void main(String[] args) {
//         PaymentGateway gateway;

//         // Decide payment gateway at runtime
//         String userChoice = "PayPal"; // Imagine this comes from user input
//         if (userChoice.equals("PayPal")) {
//             gateway = new PayPal();
//         } else {
//             gateway = new Stripe();
//         }

//         // Process payment without knowing the exact gateway
//         gateway.processPayment(100.0);
//     }
// }


// You can handle multiple subclasses in a single loop.
// Adding a new shape (e.g., Triangle) doesn’t require changing the drawing logic.

// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     @Override
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Square extends Shape {
//     @Override
//     void draw() {
//         System.out.println("Drawing a square");
//     }
// }

// public class DynamicMethodDispatch {
//     public static void main(String[] args) {
//         Shape[] shapes = { new Circle(), new Square() }; // Array of Shape references

//         // Draw all shapes without knowing their exact types
//         for (Shape shape : shapes) {
//             shape.draw(); // Calls the correct draw() method at runtime
//         }
//     }



// Why Use a Parent Reference?
// You asked, “Why not just create Child1 and Child2 directly?” Here’s why:

// Flexibility: You can decide the implementation at runtime (e.g., based on user input, configuration, etc.).

// Reusability: You can write methods that work with any subclass of the parent class.

// Extensibility: You can add new subclasses without changing existing code.

// Loose Coupling: Your code depends on abstractions (e.g., PaymentGateway) rather than concrete implementations (e.g., PayPal, Stripe).

// When to Use Dynamic Method Dispatch
// When you need to decide the implementation at runtime.

// When you want to write generic code that works with multiple subclasses.

// When you’re building frameworks or libraries that need to be extensible.

// Dynamic injection - refer chatgpt (https://chatgpt.com/share/67ca6c67-d100-8005-8777-8e97160beeb5)