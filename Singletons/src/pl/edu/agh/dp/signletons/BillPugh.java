package pl.edu.agh.dp.signletons;

public class BillPugh {

    private int data = 0;

    private BillPugh() {}

    private static class SingletonHelper {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return SingletonHelper.instance;
    }

    public int getData() {
        return data++;
    }
}
