package pl.edu.agh.dp.signletons;

public class Eager {

    private volatile static Eager instance = new Eager();

    private int data = 0;

    private Eager() {}

    public static Eager getInstance() {
        return instance;
    }

    public int getData() {
        return data++;
    }
}
