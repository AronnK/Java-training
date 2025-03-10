public class Findings {
        public static void Squid(int n) {
            // Upper half
            for (int i = 2*n; i >= 1; i--) {
                printStars(i);
                printSpaces(2 * (n - i));
                printStars(i);
                System.out.println();
            }
    
            // Lower half
            for (int i = 1; i <= n*2; i++) {
                printStars(i);
                printSpaces(2 * (n - i));
                printStars(i);
                System.out.println();
            }
        }
    
        private static void printStars(int count) {
            for (int i = 0; i < count*2; i++) {
                System.out.print("* ");
            }
        }
    
        private static void printSpaces(int count) {
            for (int i = 0; i < count*2; i++) {
                System.out.print("  ");
            }
        }
    
        public static void main(String[] args) {
            int n = 3; // Change this value for different sizes
            Squid(n);
        }
    }
    
