public class ShapeArray {
    public static void main(String[] args) {
        Triangle tri = new Triangle(3, 4, 5);

        Circle cir = new Circle(5);

        Rectangle rect = new Rectangle(10, 7);

        Shape[] shapeArray = {tri, cir, rect};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
