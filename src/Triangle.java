class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double x = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
    }

    @Override
    public double perimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle [Area: " + area() + " | Perimeter: " + perimeter() + "]";
    }
}
