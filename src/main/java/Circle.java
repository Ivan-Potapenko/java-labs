public class Circle extends Ellipse implements WithRadius{

    Circle()
    {
        a = 0;
        b = 0;
    }

    Circle(double r)
    {
        a = r;
        b = r;
    }

    @Override
    public double getRadius() {
        return a;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }

    static Circle fromArea(double area) {
        double r = Math.sqrt(area / Math.PI);
        return new Circle(r);
    }
}
