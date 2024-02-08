package pl.edu.agh.dp.signletons;

public class DoubleCheck {

    private volatile static DoubleCheck instance = null;

    private int data = 0;

    private DoubleCheck() {}

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null)
                    instance = new DoubleCheck();
            }
        }
        return instance;
    }

    public int getData() {
        return data++;
    }
}
