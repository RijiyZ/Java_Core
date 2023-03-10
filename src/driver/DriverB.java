package driver;

import transport.Competing;
import transport.Transport;

public class DriverB <T extends Transport & Competing> extends Driver {

    public DriverB(String fullName, boolean license, int experience, String category) {
        super(fullName, license, experience, category);
    }


    @Override
    public void startMoving() {
        System.out.println("Водители категории B могут стартовать");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водители с другой категорией остановитесь");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водители категории 'B' заправляют автомобиль");
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }



    public void drive(T transport) {
        System.out.println("Водитель " + getFullName() +
                " может управлять транспортным средством " + transport.getBrand() + " " + transport.getModel() + " и учавствовать в заезде");
    }
}
