import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       //Transport lada = new Transport(
       //        "Lada",
       //        "Granta",
       //        1.5,
       //        null,
       //        2022,
       //        "Russia",
       //        90);
       //lada.setRegNumber("H998HP193");
       //System.out.println(lada.isCorrectRegNumber());
       //Transport audi = new Transport(
       //        "Audi",
       //        "A8",
       //        3.0,
       //        null,
       //        2020,
       //        "Germany",
       //        120);
       //audi.setGears("Автомат");
       //audi.setRegNumber("H998H8193");
       //System.out.println(audi.isCorrectRegNumber());
       //Transport bmw = new Transport(
       //        "Bmw",
       //        "Z8",
       //        0,
       //        "Black",
       //        2021,
       //        "Germany",
       //        140);
       //bmw.setSummerTyres(false);
       //bmw.setKey(new Transport.Key(true,false));
       //bmw.setInsurance(new Transport.Insurance(LocalDate.now(),40_450,"23423443"));
       //bmw.getInsurance().checkExpineDay();
       //bmw.getInsurance().checkNumber();
       //Transport kia = new Transport(
       //        "Kia",
       //        "Sportage 4",
       //        2.4,
       //        "Red",
       //        0,
       //        "Южная Корея",
       //        220);
       //Transport hyandai = new Transport(
       //        null,
       //        "Avante",
       //        1.6,
       //        null,
       //        2016,
       //        "Южная Корея",
       //        0
       //        );
        //printInfo(lada);
        //printInfo(audi);
        //printInfo(bmw);
        //printInfo(kia);
        //printInfo(hyandai);

        //Bus MersedecBus = new Bus(
        //        "Мерседес",
        //        "АМГ",
        //        4.6,
        //        "Синий",
        //        1522,
        //        "Russia",
        //        150);
//
        //Bus KamazBus = new Bus(
        //        "Kamaz",
        //        "Azazaz",
        //        4.6,
        //        "Синий",
        //        1429,
        //        "Russia",
        //        450);
//
        //Bus LadaBus = new Bus(
        //        "lada",
        //        "grantoo",
        //        4.6,
        //        "Синий",
        //        1999,
        //        "Russia",
        //        550);

        //printInfo(LadaBus);
        //printInfo(KamazBus);
        //printInfo(MersedecBus);

        Car daewooNexia = new Car("Daewoo", "Nexia",3.6, TypeOfBody.SEDAN);
        Car nissanSilvia = new Car("Nissan", "Silvia",2.6, TypeOfBody.CROSSOVER);
        Car toyotaSupra = new Car("Toyota", "Supra",2.8, TypeOfBody.OFFROAD);
        Car nissianSkyline = new Car("Nissan", "Skyline",4.6, TypeOfBody.HATCHBACK);
        printInfo(daewooNexia);
        printInfo(nissanSilvia);
        printInfo(toyotaSupra);
        printInfo(nissianSkyline);

        nissanSilvia.pitStop(true);
        daewooNexia.maxSpeed(340);
        toyotaSupra.startMoving();
        nissianSkyline.pitStop(false);

        Bus ankai = new Bus("ANKAI ", "ANKAI1488",1.3, Capacity.EXTRA_LARGE);
        Bus goldenDragon = new Bus("GOLDEN", "DRAGON",2.0, Capacity.MEDIUM);
        Bus hyundaiDai = new Bus("HYUNDAI", "DAI",1.8, Capacity.EXTRA_SMALL);
        Bus isuzu = new Bus("ISUZU ", "UZUSI ",2.6, Capacity.LARGE);
        printInfo(ankai);
        printInfo(goldenDragon);
        printInfo(hyundaiDai);
        printInfo(isuzu);

        ankai.pitStop(true);
        goldenDragon.maxSpeed(340);
        hyundaiDai.startMoving();
        isuzu.pitStop(false);

        Truck man = new Truck("MAN ", "WOMAN",2.3, Weight.N1);
        Truck daf = new Truck("DAF", "FAMINE",4.2, Weight.N3);
        Truck scania = new Truck("SCANIA", "AINACS",3.1, Weight.N1);
        Truck ivenko = new Truck("IVENKO ", "IVANKO ",6.6, Weight.N2);
        printInfo(man);
        printInfo(daf);
        printInfo(scania);
        printInfo(ivenko);

        man.pitStop(true);
        goldenDragon.maxSpeed(340);
        scania.startMoving();
        ivenko.pitStop(false);

        DriverB<Car> ivanDikarev = new DriverB<>("Дикарев Иван Сергеевич", true, 2);
        DriverC<Truck> elenaDikareva = new DriverC<>("Дикарева Елена Владимировна", false, 12);
        DriverD<Bus> innaKolesnikova = new DriverD<>("Колесникова Инна Владимировна", true, 8);

        ivanDikarev.drive(daewooNexia);
        elenaDikareva.drive(scania);
        innaKolesnikova.drive(isuzu);
    }

    private static void printInfo(Transport transport) {
        System.out.println("Марка авто: " + transport.getBrand() +
                        " / Модель: " + transport.getModel() +
                        " / Двигатель: " + transport.getEngineVolume()
                       // " / Год: " + car.getProductionYear() +
                       // " / Производитель: " + car.getProductionCountry() +
                       // " / Цвет: " + car.getColor() +
                       // " / Коробка передач: " + car.getGears() +
                       // " / Тип кузова: " + car.getTypeOfBody() +
                       // " / Регистрационный номер: " + car.getRegNumber() +
                       // " / Колличество мест: " + car.getSeatsCount() +
                       // " / Резина: " + (car.isSummerTyres()?"Летняя" : " Зимняя") +
                       // " / " + (car.getKey().isWithoutKeyAccess() ? "Безключевой доступ" : "Ключевой доступ") +
                       // " / " + (car.getKey().isWithoutKeyAccess() ? "Удаленный запуск" : "Обычный запуск") +
                       // " / Номер страховки: " + car.getInsurance().getNumber() +
                       // " / Срок действия страховки: " + car.getInsurance().getExpineDate() +
                       // " / Стоимость страховки: " + car.getInsurance().getCost() +
                       // " / Максимальная скорость: " + car.getMaxSpeed()
                );
        transport.printType();

    }
}
