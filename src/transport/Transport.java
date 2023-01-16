package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;

    List<Mechanic> mechanic;

    List<Transport> transports;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
    }

    public void startMoving() {
        System.out.println(getBrand() +" " + getModel() + " начинает движение");
    }
    public void endMoving() {
        System.out.println(getBrand() +" " + getModel() + " заканчивает движение");
    }
    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println(getBrand() + " " + getModel() +" осуществил пит-стоп.");
        } else {
            System.out.println(getBrand() + " " + getModel() +" не осуществлял пит-стоп.");
        }
    }

    @Override
    public void bestLapTime(double minutes) {
        System.out.println("Лучшее время круга " + minutes + " минут.");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed + " км/ч.");
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void printType();
    public abstract boolean service();
    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public void addMechanics(Mechanic mechanics) {
        mechanics.add(mechanics);
    }

    public abstract void performMaintenance(List<Mechanic> mechanics);


    @Override
    public String toString() {
        return  brand + " " +  model + ", Двигатель: " + engineVolume + " \n";
    }
}






























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































