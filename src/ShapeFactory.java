/**
 * Created by Wei Shi on 2017/2/22.
 */
public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            throw new IllegalArgumentException();
        }

        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}
