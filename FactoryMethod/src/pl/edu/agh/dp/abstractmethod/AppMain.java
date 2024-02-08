package pl.edu.agh.dp.abstractmethod;

import pl.edu.agh.dp.shapes.Shape;

public class AppMain {
    public static void main(String[] args) {
        Shape circle = new CircleFactory().factoryMethod();
        circle.draw();

        Shape rectangle = new RectangleFactory().factoryMethod();
        rectangle.draw();
    }
}
