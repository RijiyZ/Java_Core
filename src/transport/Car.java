package transport;

public class Car extends Transport{
    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int maxSpeed, String gears, String typeOfBody, String regNumber, int seatsCount, boolean summerTyres, Key key, Insurance insurance) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed, gears, typeOfBody, regNumber, seatsCount, summerTyres, key, insurance);
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed);
    }
}
