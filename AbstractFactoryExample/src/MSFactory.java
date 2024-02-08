/**
 * Created by rafal on 20.12.2017.
 */
public class MSFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new MSConnection();
    }

    @Override
    public Statement creteStatement() {
        return new MSStatement();
    }
}
