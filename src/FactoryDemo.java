/**
 * Created by Wei Shi on 2017/2/22.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape c = sf.getShape("Circle");
        Shape r = sf.getShape("RECTANGLE");
        Shape s = sf.getShape("square");
        c.draw();
        r.draw();
        s.draw();
    }
}
