package driver;

import transport.Competing;
import transport.Transport;

public class DriverD <T extends Transport & Competing> extends Driver {
    public DriverD(String fullName, boolean license, int experience, String category) {
        super(fullName, license, experience, category);
    }

    @Override
    public void startMoving() {
        System.out.println("Водители категории D могут стартовать");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водители с другой категорией остановитесь");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водители категории D заправляют автомобиль");
    }

    public void drive(T transport) {
        System.out.println("Водитель " + getFullName() +
                " может управлять транспортным средством " + transport.getBrand() + " " + transport.getModel() + " и учавствовать в заезде");
    }
}