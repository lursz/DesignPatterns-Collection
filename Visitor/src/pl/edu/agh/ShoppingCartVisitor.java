package pl.edu.agh;

public class ShoppingCartVisitor implements Visitor {
    @Override
    public int visit(Book book) {
        int price = book.getPrice();
        if (price > 100) {
            price = price-10;
        }
        System.out.println("Book: " + book.getName() + " price: " + price);
        return price;
    }

    @Override
    public int visit(Fruit fruit) {
        int price = fruit.getPrice()* fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + " price: " + price);
        return price;
    }
}
