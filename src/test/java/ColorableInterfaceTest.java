public class ColorableInterfaceTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        shapes[3] = new Triangle();
        for (Shape shape : shapes) {
            if (shape instanceof Square){
                System.out.println(((Colorable) shape).howToColor());
            } else {
                System.out.println(shape.getArea());
            }
        }
    }
}