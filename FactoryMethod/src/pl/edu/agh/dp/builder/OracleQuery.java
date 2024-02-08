package pl.edu.agh.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class OracleQuery implements Query {
        List<String> queryElements = new ArrayList<>();

    @Override
    public void addElement(String sqlCommandPart) {
        if(sqlCommandPart != null)
            queryElements.add(sqlCommandPart);
    }

    @Override
    public String toString() {
        return "OracleQuery{" +
                "queryElements=" + queryElements +
                '}';
    }
}
