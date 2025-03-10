public class Pattern {

    public static void main(String[] args) {
        int n = 5;
        shitty_pattern(n);
    }

    @SuppressWarnings("unused")
    // static void left_triangle(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <= i; k++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    static void left_triangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void right_triangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = n-i-1; j > 0; j--) {
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void inverted_left_triangle(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void inverted_right_triangle(int n) {
        for(int i = n; i > 0; i--) {
            // Print spaces first
            for(int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for(int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void center_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void center_odd_triangle(int n) {
        n = (2 * n - 1);
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void center_odd_hollow_triangle(int n) {
        n = (2 * n - 1);
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((k == 1) || (k == i) || (n == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void left_hollow_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((k == 1) || (k == i) || (n == i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void center_inv_triangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    @SuppressWarnings("unused")
    static void center_inv_hollow_triangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((k == 1) || (k == i) || (n == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    static void sandglass(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((k == 1) || (k == i) || (n == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((k == 1) || (k == i) || (n == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                System.out.print((j == 1 || j == i || j == n || j == n - i + 1) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void combined_pattern(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            
            for(int j = 0; j < 2*(n-i); j++) {
                System.out.print("  ");
            }
            
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        
            for(int j = 0; j < 2*(n-i-1); j++) {
                System.out.print("  ");
            }
            

            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void shitty_pattern(int n){
        int k;
        for (int i = 1; i <= n; i++) {
            k = i;
            for (int j = 1; j <= n; j++) {
                System.out.print((k>n)?(k-n) + " ":(k) + " ");
                k++;
            }
            System.out.println();
        }
    }
}
