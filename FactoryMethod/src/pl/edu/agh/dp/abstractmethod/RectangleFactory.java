package pl.edu.agh.dp.abstractmethod;

import pl.edu.agh.dp.shapes.Rectangle;
import pl.edu.agh.dp.shapes.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
