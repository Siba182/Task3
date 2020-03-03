public class Circle extends Shape {

    // fields
   private double radius;

    // constructors
    public Circle()
    {
        name = "Circle";
        radius = 0;
    }
    public Circle(double _radius)
    {
        name = "Circle";
        radius = _radius;
    }
    // methods
    public void computeArea()
    {
        area = Math.PI * radius * radius;
    }
    public void computePerimeter()
    {
        perimeter = 2 *Math.PI * radius;
    }
}
