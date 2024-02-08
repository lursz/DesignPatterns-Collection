package pl.edu.agh.dp.simplefactory;

import pl.edu.agh.dp.shapes.Shape;

public class AppMain {
    public static void main(String[] args) {
        Shape circle = SimpleShapeFactory.factoryMehtod("CIRCLE");
        if (circle != null)
            circle.draw();
    }
}
