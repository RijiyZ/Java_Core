import transport.Bus;
import transport.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Transport lada = new Transport(
                "Lada",
                "Granta",
                1.5,
                null,
                2022,
                "Russia",
                90);
        lada.setRegNumber("H998HP193");
        System.out.println(lada.isCorrectRegNumber());
        Transport audi = new Transport(
                "Audi",
                "A8",
                3.0,
                null,
                2020,
                "Germany",
                120);
        audi.setGears("Автомат");
        audi.setRegNumber("H998H8193");
        System.out.println(audi.isCorrectRegNumber());
        Transport bmw = new Transport(
                "Bmw",
                "Z8",
                0,
                "Black",
                2021,
                "Germany",
                140);
        bmw.setSummerTyres(false);
        bmw.setKey(new Transport.Key(true,false));
        bmw.setInsurance(new Transport.Insurance(LocalDate.now(),40_450,"23423443"));
        bmw.getInsurance().checkExpineDay();
        bmw.getInsurance().checkNumber();
        Transport kia = new Transport(
                "Kia",
                "Sportage 4",
                2.4,
                "Red",
                0,
                "Южная Корея",
                220);
        Transport hyandai = new Transport(
                null,
                "Avante",
                1.6,
                null,
                2016,
                "Южная Корея",
                0
                );
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyandai);

        Bus MersedecBus = new Bus(
                "Мерседес",
                "АМГ",
                4.6,
                "Синий",
                1522,
                "Russia",
                150);

        Bus KamazBus = new Bus(
                "Kamaz",
                "Azazaz",
                4.6,
                "Синий",
                1429,
                "Russia",
                450);

        Bus LadaBus = new Bus(
                "lada",
                "grantoo",
                4.6,
                "Синий",
                1999,
                "Russia",
                550);

        printInfo(LadaBus);
        printInfo(KamazBus);
        printInfo(MersedecBus);
    }

    private static void printInfo(Transport car) {
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
                        " / Стоимость страховки: " + car.getInsurance().getCost() +
                        " / Максимальная скорость: " + car.getMaxSpeed()
                );
    }
}
