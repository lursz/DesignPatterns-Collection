package pl.edu.agh.dp;

public interface PaymentStrategy {
    public void pay(int amount);
}

class Przelewy24Strategy implements PaymentStrategy {
    private String cardNumber;
    private String holderName;
    private String expiryDate;
    private String CVC;

    public Przelewy24Strategy(String cardNumber, String holderName, String expiryDate, String CVC) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.CVC = CVC;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Przelewy24: " + holderName + "-" + cardNumber + " amount:" + amount);
    }
}

class PaypalStrategy implements PaymentStrategy {

    private String email;
    private String pass;

    public PaypalStrategy(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal: " + email + " amount:" + amount);
    }
}


