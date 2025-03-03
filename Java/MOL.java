class MLO {
    void Sum(int a, int b) {
        System.out.println(a + b);
    }

    void Sum(double a, double b) {
        System.out.println(a + b);
    }

    public void main(String[] args) {
        Sum(1, 2);
        Sum(1.5, 2.5);
    }
}