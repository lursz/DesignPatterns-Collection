package pl.edu.agh.dp;

public interface Handler {

    void setNextHandler(Handler next);
    void withdraw(Money cash);
}
