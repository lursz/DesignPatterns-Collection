/**
 * Created by rafal on 15.12.2017.
 */
public class Factory {

    public static Database create(String type) {
        switch (type) {
            case "Oracle":
                return new Oracle();
            case "MSSql":
                return new MSSql();
        }

        return null;
    }
}
