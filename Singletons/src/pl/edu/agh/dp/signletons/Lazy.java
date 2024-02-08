package pl.edu.agh.dp.signletons;

public class Lazy {
    private static Lazy instance = null;


    private Lazy() {
    }

    public static Lazy getInstance() {
        if (instance == null)
            // thread 1 premitted
            // thraed 2 wchodzi
            instance = new Lazy();
        return instance;
        // thread 2 permitted
    }
}
