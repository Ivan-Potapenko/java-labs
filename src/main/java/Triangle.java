public class Triangle implements Shape{

    double a, b, c;

    Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea()
    {
        if (a + b > c && a + c > b && b + c > a)
        {
            return (getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c));
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }
}
