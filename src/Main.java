import Mechanic.Mechanic;
import Mechanic.ProfessionalSkills;
import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car daewooNexia = new Car("Daewoo", "Nexia",3.6, TypeOfBody.SEDAN);
        Car nissanSilvia = new Car("Nissan", "Silvia",2.6, TypeOfBody.CROSSOVER);
        Car toyotaSupra = new Car("Toyota", "Supra",2.8, TypeOfBody.OFFROAD);
        Car nissianSkyline = new Car("Nissan", "Skyline",4.6, TypeOfBody.HATCHBACK);

//        nissanSilvia.pitStop(true);
//        daewooNexia.maxSpeed(340);
//        toyotaSupra.startMoving();
//        nissianSkyline.pitStop(false);
//
        Bus ankai = new Bus("ANKAI ", "ANKAI1488",1.3, Capacity.EXTRA_LARGE);
        Bus goldenDragon = new Bus("GOLDEN", "DRAGON",2.0, Capacity.MEDIUM);
        Bus hyundaiDai = new Bus("HYUNDAI", "DAI",1.8, Capacity.EXTRA_SMALL);
        Bus isuzu = new Bus("ISUZU ", "UZUSI ",2.6, Capacity.LARGE);
//
//        ankai.pitStop(true);
//        goldenDragon.maxSpeed(340);
//        hyundaiDai.startMoving();
//        isuzu.pitStop(false);
//
        Truck man = new Truck("MAN ", "WOMAN",2.3, Weight.N1);
        Truck daf = new Truck("DAF", "FAMINE",4.2, Weight.N3);
        Truck scania = new Truck("SCANIA", "AINACS",3.1, Weight.N1);
        Truck ivenko = new Truck("IVENKO ", "IVANKO ",6.6, Weight.N2);
//
//        man.pitStop(true);
//        goldenDragon.maxSpeed(340);
//        scania.startMoving();
//        ivenko.pitStop(false);
//
//        service(daewooNexia, nissanSilvia, toyotaSupra, nissianSkyline);
//        service(ankai, goldenDragon, hyundaiDai, isuzu);
//        service(man, daf, scania, ivenko);
//    }
//
//
//    private static void service(Transport...transports){
//        for (Transport transport : transports) {
//            serviceTransport(transport);
//        }
//    }
//    private static void serviceTransport(Transport transport) {
//        try {
//            if (!transport.service()) {
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel() + " не прошел диагностику");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        Mechanic ivan = new Mechanic("Иван", "Дикарев", "PitStop", ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT);
        Mechanic max = new Mechanic("Макс", "Ушаков", "Автосервис DAEWOO", ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS);
        Mechanic dima = new Mechanic("Дима", "Илларионов", "У Демаса", ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS);
        Mechanic nastya = new Mechanic("Анастасия", "Дикарева", "PitStop", ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT);
        Mechanic elena = new Mechanic("Елена", "Дикарева", "Fit Service", ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES);

        DriverB<Car> andrei = new DriverB<>("Андрей Сайгин", true, 11,
                "B");
        DriverD<Truck> ekaterina = new DriverD<>("Екатерина Абубокар", true,
                17, "D");
        DriverB<Car> artem = new DriverB<>("Артем Жихарев", true, 9,
                "B");
        DriverB<Car> aleksandra = new DriverB<>("Александра Мирная", true,
                8, "B");
        DriverC<Truck> dasha = new DriverC<>("Даша Стограмми Наша", true,
                10, "C");



        ArrayList<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(ivan);
        mechanics.add(max);
        mechanics.add(dima);
        mechanics.add(nastya);
        mechanics.add(elena);
        System.out.println(mechanics);

        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(daewooNexia);
        transports.add(nissanSilvia);
        transports.add(goldenDragon);
        transports.add(isuzu);
        transports.add(scania);
        System.out.println(transports);

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(dasha);
        drivers.add(aleksandra);
        drivers.add(artem);
        drivers.add(ekaterina);
        drivers.add(andrei);
        System.out.println(drivers);

    }



//    private static void printInfo(Transport transport) {
//        System.out.println("Марка авто: " + transport.getBrand() +
//                        " / Модель: " + transport.getModel() +
//                        " / Двигатель: " + transport.getEngineVolume()
//                       // " / Год: " + car.getProductionYear() +
//                       // " / Производитель: " + car.getProductionCountry() +
//                       // " / Цвет: " + car.getColor() +
//                       // " / Коробка передач: " + car.getGears() +
//                       // " / Тип кузова: " + car.getTypeOfBody() +
//                       // " / Регистрационный номер: " + car.getRegNumber() +
//                       // " / Колличество мест: " + car.getSeatsCount() +
//                       // " / Резина: " + (car.isSummerTyres()?"Летняя" : " Зимняя") +
//                       // " / " + (car.getKey().isWithoutKeyAccess() ? "Безключевой доступ" : "Ключевой доступ") +
//                       // " / " + (car.getKey().isWithoutKeyAccess() ? "Удаленный запуск" : "Обычный запуск") +
//                       // " / Номер страховки: " + car.getInsurance().getNumber() +
//                       // " / Срок действия страховки: " + car.getInsurance().getExpineDate() +
//                       // " / Стоимость страховки: " + car.getInsurance().getCost() +
//                       // " / Максимальная скорость: " + car.getMaxSpeed()
//                );
//        transport.printType();
//    }
}
