package pl.edu.agh;

public class AppMain {
    public static void main(String[] args) {
        Element[] items = {new Book(10, "abcd"), new Book(130, "zxcv"),
        new Fruit(9, 4, "banan"), new Fruit(3, 2, "jablko")};

        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        int price = 0;

        for(Element item: items) {
            price += item.accept(visitor);
        }

        System.out.println("Total: " + price);
    }
}
