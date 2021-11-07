public class Ellipse implements Shape {

    double a, b;

    Ellipse()
    {
        a=0;
        b=0;
    }

    Ellipse(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * a * b + Math.pow((a - b), 2)) / (a + b);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }
}
