package pl.edu.agh.dp.abstractfactory;

import pl.edu.agh.dp.colors.Blue;
import pl.edu.agh.dp.colors.Color;
import pl.edu.agh.dp.colors.Green;
import pl.edu.agh.dp.colors.Red;
import pl.edu.agh.dp.shapes.Circle;
import pl.edu.agh.dp.shapes.Rectangle;
import pl.edu.agh.dp.shapes.Shape;

public abstract class AbstractFactory {
    protected Color colorFactory(String color) {
        return null;
    }
    protected Shape shapeFactory(String shape) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {
    @Override
    public Color colorFactory(String color) {
        if(color == null)
            return null;
        switch (color) {
            case "RED": return new Red();
            case "GREEN": return new Green();
            case "BLUE": return new Blue();
            default: return null;
        }
    }
}

class ShapeFactory extends AbstractFactory {
    @Override
    public Shape shapeFactory(String shape) {
        if(shape == null)
            return null;
        switch (shape) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            default: return null;
        }
    }
}
