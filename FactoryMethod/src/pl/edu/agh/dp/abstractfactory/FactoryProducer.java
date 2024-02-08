package pl.edu.agh.dp.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if(type == null)
            return null;
        switch (type) {
            case "COLOR": return new ColorFactory();
            case "SHAPE": return new ShapeFactory();
            default: return null;
        }
    }
}
