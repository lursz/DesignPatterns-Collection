package pl.edu.agh.dp;

public class Observer1 implements Observer {
    @Override
    public void notifyMe() {
        System.out.println("Observer1 notifyMe!!!");
    }
}
