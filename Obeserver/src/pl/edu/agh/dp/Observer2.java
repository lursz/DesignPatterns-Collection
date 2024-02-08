package pl.edu.agh.dp;

public class Observer2 implements Observer {
    @Override
    public void notifyMe() {
        System.out.println("Observer2 notifyMe!!!");
    }
}
