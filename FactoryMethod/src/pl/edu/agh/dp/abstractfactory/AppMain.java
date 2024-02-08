package pl.edu.agh.dp.abstractfactory;

import pl.edu.agh.dp.colors.Color;
import pl.edu.agh.dp.shapes.Shape;

public class AppMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Shape circle = shapeFactory.shapeFactory("CIRCLE");
        circle.draw();
        Color color = colorFactory.colorFactory("RED");
        color.set();
    }
}
