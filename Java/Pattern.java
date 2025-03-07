public class Pattern {

    public static void main(String[] args) {
        int n = 5;
        butterfly(n);
    }

    @SuppressWarnings("unused")
    static void left_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
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

}
