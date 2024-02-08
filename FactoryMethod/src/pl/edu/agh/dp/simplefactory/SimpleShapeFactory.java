package pl.edu.agh.dp.simplefactory;

import pl.edu.agh.dp.shapes.Circle;
import pl.edu.agh.dp.shapes.Rectangle;
import pl.edu.agh.dp.shapes.Shape;

public class SimpleShapeFactory {
    public static Shape factoryMehtod(String type) {
        if(type == null)
            return null;
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
