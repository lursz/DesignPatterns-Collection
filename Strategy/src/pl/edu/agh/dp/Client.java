package pl.edu.agh.dp;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("chleb");
        cart.add("masło");
        cart.pay(new PaypalStrategy("rafal@gmail.com", "password"));
        // lub
        cart.pay(new Przelewy24Strategy("1234-1234-1234-1234", "Rafał Mrówka", "11/23", "123"));
    }
}
