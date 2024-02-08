package pl.edu.agh.dp;

import java.util.Random;

public interface TempSensor {
    float getTemp();
    String getName();
}

class BMP280 implements TempSensor {

    private Random rand = new Random();

    @Override
    public float getTemp() {
        return rand.nextFloat(10);
    }

    @Override
    public String getName() {
        return "BMP280";
    }
}

class TMP102 implements TempSensor {

    private Random rand = new Random();

    @Override
    public float getTemp() {
        return rand.nextFloat(30);
    }

    @Override
    public String getName() {
        return "TMP102";
    }
}
