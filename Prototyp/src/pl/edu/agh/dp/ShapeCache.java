package pl.edu.agh.dp;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeName) {
        Shape cachedShape = shapeMap.get(shapeName);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Rectangle r = new Rectangle();
        r.setName("1");
        shapeMap.put(r.getName(), r);

        Square s = new Square();
        s.setName("2");
        shapeMap.put(s.getName(), s);

        Circle c = new Circle();
        c.setName("3");
        shapeMap.put(c.getName(), c);
    }
}
