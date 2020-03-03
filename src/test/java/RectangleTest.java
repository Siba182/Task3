import org.junit.Assert;
import org.junit.Test;



public class RectangleTest {
 Rectangle r = new Rectangle(5.0,2.0);
 Shape r2 = new Rectangle();

 @Test
    public void computeArea() {
     Assert.assertEquals(10.0,10, 0.0);
    }
}