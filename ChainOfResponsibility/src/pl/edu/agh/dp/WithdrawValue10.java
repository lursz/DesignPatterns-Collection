package pl.edu.agh.dp;

public class WithdrawValue10 implements Handler {

    private Handler next;

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void withdraw(Money cash) {
        if (cash.getAmount() >= 10) {
            int num = cash.getAmount() / 10;
            int remainder = cash.getAmount() % 10;
            System.out.println("You get " + num + " note in tens");
            if (remainder > 0)
                this.next.withdraw(new Money(remainder));
        } else {
            this.next.withdraw(cash);
        }
    }
}
