/**
 * Created by rafal on 20.12.2017.
 */
public abstract class Database {
    protected Connection conn;
    protected Statement statement;
    protected final DatabaseFactory factory;

    public Database(DatabaseFactory f) {
        factory = f;
    }

    public abstract void preapare();
    public void execute() {
        preapare();
        System.out.println("Wykonuje");
    }
}
