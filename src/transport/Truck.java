package transport;

public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Weight weight
    ) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " Грузовик начинает движение");
    }
    public void endMoving() {
        System.out.println(getBrand() + " " + getModel() + " Грузовик заканчивает движение");
    }
    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println(getBrand() + " " + getModel() + " Грузовик осуществил пит-стоп.");
        } else {
            System.out.println(getBrand() + " " + getModel() + " Грузовик не осуществлял пит-стоп.");
        }
    }

    @Override
    public void bestLapTime(double minutes) {
        System.out.println("Лучшее время круга для Грузовика " + minutes + " минут.");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость для Грузовика " + speed + " км/ч.");
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            String from = weight.getFrom() == null? "" : "от " + weight.getFrom() + " тонн";
            String to = weight.getTo() == null? "" : ", до " + weight.getTo() + " тонн";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

}
