/**
 * Created by rafal on 15.12.2017.
 */
public abstract class DatabaseFactory {
    public void execute(){
        Database db = create();
        db.connect();
        db.execute();
        db.disconnect();
    }

    public abstract Database create();
}
