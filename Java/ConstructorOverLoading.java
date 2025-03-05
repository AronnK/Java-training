class Area {
    Area(int a) {
        System.out.println("Area of square: " + (a * a));
    }

    Area(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    Area(int a, int b) {
        System.out.println("Area of rectangle: " + (a * b));
    }

    Area(int a, int b, char z) {
        System.out.println("Area of triangle: " + (0.5 * a * b));
    }
}

class ConstructorOverLoading {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Area a = new Area(10);
        Area c = new Area(10.0);
        Area b = new Area(10, 11);
        Area d = new Area(10, 11, 'a');
    }
}