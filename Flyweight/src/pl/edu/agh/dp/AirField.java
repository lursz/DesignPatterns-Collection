package pl.edu.agh.dp;

public abstract class AirField {
    protected String code;

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "AirField{" +
                "code='" + code + '\'' +
                '}';
    }
}

class CivilAirField extends AirField {
    public CivilAirField(String code) {
        this.code = code;
    }
}

class MilitaryAirField extends  AirField {
    public MilitaryAirField(String code) {
        this.code = code;
    }
}
