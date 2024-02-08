package pl.edu.agh.dp;

public class AirFieldRef {
    private AirField airField;

    protected String role;

    public AirFieldRef(AirField airField, String role) {
        this.airField = airField;
        this.role = role;
    }
    public AirField getAirField() {
        return airField;
    }

    @Override
    public String toString() {
        return "AirFieldRef{" +
                "airField=" + airField +
                ", role='" + role + '\'' +
                '}';
    }
}
