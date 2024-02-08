/**
 * Created by rafal on 15.12.2017.
 */
public class Main {
    public static void main(String[] args){
        DatabaseFactory dbf = new MSSqlFactory();
        dbf.execute();
    }
}
