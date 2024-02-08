package pl.edu.agh.dp;

public class WithdrawValue5 implements Handler {

    private Handler next;

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void withdraw(Money cash) {
        if (cash.getAmount() >= 5) {
            int num = cash.getAmount() / 5;
            int remainder = cash.getAmount() % 5;
            System.out.println("You get " + num + " note in fives");
            if (remainder > 0) {
                if (this.next != null)
                    this.next.withdraw(new Money(remainder));
                else {
                    System.out.println("No small cash in ATM");
                }
            }
        } else {
            System.out.println("No small cash in ATM");
        }
    }
}
