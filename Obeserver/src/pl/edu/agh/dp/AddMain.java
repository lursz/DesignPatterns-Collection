package pl.edu.agh.dp;

public class AddMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());

        subject.handleEvent();

        subject.handleEvent();
    }
}
