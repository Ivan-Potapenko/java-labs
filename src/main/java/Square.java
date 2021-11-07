public class Square extends Rectangle {

    @Override
    public ShapeType getType()
    {
        return ShapeType.SQUARE;
    }

    public double getArea()
    {
        return super.getArea();
    }

    static Rectangle fromArea(double area)
    {
        double a = Math.sqrt(area);
        return new Rectangle(a, a);
    }
}
