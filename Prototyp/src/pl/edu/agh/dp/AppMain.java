package pl.edu.agh.dp;

public class AppMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clone1 = (Shape) ShapeCache.getShape("1");
        System.out.println(clone1);

        Shape clone2 = (Shape) ShapeCache.getShape("2");
        System.out.println(clone2);

        Shape clone3 = (Shape) ShapeCache.getShape("3");
        System.out.println(clone3);

        Shape clone4 = (Shape) ShapeCache.getShape("3");
        System.out.println(clone4);
    }
}
