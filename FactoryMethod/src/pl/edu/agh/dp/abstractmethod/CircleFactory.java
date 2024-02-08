package pl.edu.agh.dp.abstractmethod;

import pl.edu.agh.dp.shapes.Circle;
import pl.edu.agh.dp.shapes.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
