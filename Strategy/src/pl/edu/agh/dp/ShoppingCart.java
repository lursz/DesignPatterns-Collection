package pl.edu.agh.dp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> shopplingList;

    public ShoppingCart() {
        this.shopplingList = new ArrayList<>();
    }

    public void add(String item) {
        this.shopplingList.add(item);
    }

    public int getTotalAmount() {
        return 15;
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(getTotalAmount());
    }
}
