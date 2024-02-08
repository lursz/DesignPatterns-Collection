package pl.edu.agh.dp;

import java.util.HashMap;
import java.util.Map;

public class AirFieldFactory {

    private Map<String, AirFieldRef> airFields = new HashMap<>();

    public AirField getAirField(String code, String type, String role) {
        AirFieldRef airFieldRef = null;
        if (airFields.containsKey(code)) {
            System.out.println("AitFiled in cache. No need to craete a new one");
            airFieldRef = airFields.get(code);
        } else {
            AirField airField;
            if(type.equals("MILITARY")) {
                airField = new MilitaryAirField(code);
            } else {
                airField = new CivilAirField(code);
            }
            airFieldRef = new AirFieldRef(airField, "DEST");
            this.airFields.put(code, airFieldRef);
        }
        return airFieldRef.getAirField();
    }
}
