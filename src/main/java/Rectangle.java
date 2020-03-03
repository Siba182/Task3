public class Rectangle extends Shape {
    // fields
    double length, width;

    // constructors
    public Rectangle()
    {
        name = "Rectangle";
    }

    public Rectangle(double _length, double _width)
    {
        name = "Rectangle";

    }
    // methods
    public double computeArea()
    {
       return area = length * width;
    }
    public void computePerimeter()
    {
        perimeter = 2*(length + width);
    }
}