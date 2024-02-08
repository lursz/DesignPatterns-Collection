package pl.edu.agh.dp;

public class WithdrawAlgorithm {
    private Handler chain;

    public WithdrawAlgorithm() {
        this.chain = new WithdrawValue10();
        this.chain.setNextHandler(new WithdrawValue5());
    }

    public static void main(String[] args) {
        WithdrawAlgorithm algorithm = new WithdrawAlgorithm();
        algorithm.chain.withdraw(new Money(83));
    }
}
