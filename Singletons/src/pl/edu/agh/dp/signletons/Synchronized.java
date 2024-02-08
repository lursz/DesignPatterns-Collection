package pl.edu.agh.dp.signletons;

public class Synchronized {
    private static Synchronized instance = null;

    private int data = 0;

    private Synchronized() {}

    public static synchronized Synchronized getInstance() {
        if (instance == null)
            instance = new Synchronized();
        return instance;
    }

    public int getData() {
        return data++;
    }
}
