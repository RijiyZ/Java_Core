package transport;

import java.util.List;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity
    ) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMoving() {
        System.out.println(getBrand() +" " + getModel() + " Автобус начинает движение");
    }
    public void endMoving() {
        System.out.println(getBrand() +" " + getModel() + " Автобус заканчивает движение");
    }
    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println(getBrand() + " " + getModel() + " Автобус осуществил пит-стоп.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " Автобус не осуществлял пит-стоп.");
        }
    }

    @Override
    public void bestLapTime(double minutes) {
        System.out.println("Лучшее время круга для Автобуса " + minutes + " минут.");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость для Автобуса " + speed + " км/ч.");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " человек, до " + capacity.getTo() + " человек");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностики не нуждается");
        return true;
    }

    @Override
    public void performMaintenance(List<Mechanic> mechanics) {

    }

}
