package pl.edu.agh.dp;

import java.util.Random;

public interface Sensor {

    float getTemp();

    String getName();
}

class BMP280 implements Sensor {

    private Random rand = new Random();

    @Override
    public float getTemp() {
        return rand.nextFloat(15);
    }

    @Override
    public String getName() {
        return "BMP280";
    }
}

class TMP102 implements Sensor {

    private Random rand = new Random();

    @Override
    public float getTemp() {
        return rand.nextFloat(35);
    }

    @Override
    public String getName() {
        return "TMP102";
    }
}
