import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                null,
                1.7,
                "Желтый",
                2015,
                "Россия");
        lada.setRegNumber("H998HP193");
        System.out.println(lada.isCorrectRegNumber());
        Car audi = new Car(
                "Audi",
                "A8",
                3.0,
                null,
                2020,
                "Germany");
        audi.setGears("Автомат");
        audi.setRegNumber("H998H8193");
        System.out.println(audi.isCorrectRegNumber());
        Car bmw = new Car(
                "Bmw",
                "Z8",
                0,
                "Black",
                2021,
                "Germany");
        bmw.setSummerTyres(false);
        bmw.setKey(new Car.Key(true,false));
        bmw.setInsurance(new Car.Insurance(LocalDate.now(),40_450,"23423443"));
        bmw.getInsurance().checkExpineDay();
        bmw.getInsurance().checkNumber();
        Car kia = new Car(
                "Kia",
                "Sportage 4",
                2.4,
                "Red",
                0,
                "Южная Корея");
        Car hyandai = new Car(
                null,
                "Avante",
                1.6,
                null,
                2016,
                "Южная Корея");
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(hyandai);
        printInfo(kia);

    }

    private static void printInfo(Car car) {
        System.out.println("Марка авто: " + car.getBrand() +
                        " / Модель: " + car.getModel() +
                        " / Год: " + car.getProductionYear() +
                        " / Производитель: " + car.getProductionCountry() +
                        " / Цвет: " + car.getColor() +
                        " / Двигатель: " + car.getEngineVolume() +
                        " / Коробка передач: " + car.getGears() +
                        " / Тип кузова: " + car.getTypeOfBody() +
                        " / Регистрационный номер: " + car.getRegNumber() +
                        " / Колличество мест: " + car.getSeatsCount() +
                        " / Резина: " + (car.isSummerTyres()?"Летняя" : " Зимняя") +
                        " / " + (car.getKey().isWithoutKeyAccess() ? "Безключевой доступ" : "Ключевой доступ") +
                        " / " + (car.getKey().isWithoutKeyAccess() ? "Удаленный запуск" : "Обычный запуск") +
                        " / Номер страховки: " + car.getInsurance().getNumber() +
                        " / Срок действия страховки: " + car.getInsurance().getExpineDate() +
                        " / Стоимость страховки: " + car.getInsurance().getCost()
                );
    }
}
