
public class RunShape {
    public static void main(String args[])
    {
        Shape s = new Shape();
        Rectangle r = new Rectangle(5.0, 2.0);
       Circle c = new Circle(4.0);

        r.computeArea();
        r.computePerimeter();

        c.computeArea();
        c.computePerimeter();

        r.display();
        c.display();

    }
}

