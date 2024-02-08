/**
 * Created by rafal on 20.12.2017.
 */
public class MSDatabase extends Database {

    public MSDatabase(DatabaseFactory f) {
        super(f);
    }

    @Override
    public void preapare() {
        conn = factory.createConnection();
        statement = factory.creteStatement();
    }
}
