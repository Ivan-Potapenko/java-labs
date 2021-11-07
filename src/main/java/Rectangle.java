public class Rectangle  implements Shape {

    double a, b;

    Rectangle()
    {
        a = 0;
        b = 0;
    }

    Rectangle(double a)
    {
        this.a = a;
        this.b = a;
    }

    Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea()
    {
        return a*b;
    }

    @Override
    public double getPerimeter()
    {
        return 2*(a+b);
    }

    @Override
    public ShapeType getType()
    {
        return ShapeType.RECTANGLE;
    }
}
