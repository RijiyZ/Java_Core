package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
}