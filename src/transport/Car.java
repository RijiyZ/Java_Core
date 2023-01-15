package transport;

import Mechanic.Mechanic;
import driver.Driver;
import driver.DriverB;

import java.util.ArrayList;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;

    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody
    ) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void startMoving() {
        System.out.println(getBrand() +" " + getModel() + " легковая машина начинает движение");
    }
    public void endMoving() {
        System.out.println(getBrand() +" " + getModel() + " легковая машина заканчивает движение");
    }
    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println(getBrand() + " " + getModel() + " легковая машина осуществила пит-стоп.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " легковая машина не осуществляла пит-стоп.");
        }
    }

    @Override
    public void bestLapTime(double minutes) {
        System.out.println("Лучшее время круга для легковой машины " + minutes + " минут.");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость для легковой машины " + speed + " км/ч.");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }
}
