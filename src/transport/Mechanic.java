package transport;

import java.util.List;
import java.util.Objects;

public class Mechanic<B extends Transport>  {
    private final String firstName;
    private final String lastName;
    private String company;
    private final ProfessionalSkills professionalSkills;

    public Mechanic(String firstName, String lastName, String company, ProfessionalSkills professionalSkills) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "Иванов";
        } else {
            this.lastName = lastName;
        }
        setCompany(company);
        this.professionalSkills = professionalSkills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            this.company = "Компания";
        } else {
            this.company = company;
        }
    }

    public ProfessionalSkills getProfessionalSkills() {
        return professionalSkills;
    }



    public void fixTheVehicle(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName +
                " починит " + professionalSkills + ", " + transport.getBrand() + " " + transport.getModel());
    }

    public void carryOutTechnicalService(Transport transport) {
        System.out.println("Механик " + firstName + " " + lastName +
                " осуществляет техническое обслуживание " + professionalSkills + ", " + transport.getBrand()
                + " " + transport.getModel());
    }
    public static void mechanicsBusInTheList(List<Mechanic<Bus>> mechanicBus) {
        for (Mechanic<Bus> mechanicD : mechanicBus) {
            System.out.println("Механик по обслуживанию автобусов: " + mechanicD.getFirstName() + " " + mechanicD.getLastName() +
                    " с компании " + mechanicD.company);
        }
    }
    public static void mechanicsCarInTheList(List<Mechanic<Car>> mechanicCar) {
        for (Mechanic<Car> mechanicB : mechanicCar) {
            System.out.println("Механик по обслуживанию легковых автомобилей: " + mechanicB.getFirstName() + " " + mechanicB.getLastName() +
                    " с компании " + mechanicB.company);
        }
    }
    public static void mechanicsTruckInTheList(List<Mechanic<Truck>> mechanicTruck) {
        for (Mechanic<Truck> mechanicC : mechanicTruck) {
            System.out.println("Механик по обслуживанию грузовых автомобилей: " + mechanicC.getFirstName() + " " + mechanicC.getLastName() +
                    " с компании " + mechanicC.company);
        }
    }

    public void add(Mechanic mechanic) {
    }
    public void runTO() {
        System.out.println("Тухобслуживание транспорта");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && professionalSkills == mechanic.professionalSkills;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, professionalSkills);
    }

    @Override
    public String toString() {
        return "Механик: " + firstName + " " + lastName +
                " , Из компании " + company +
                ", С Данными скилами: " + professionalSkills + "\n";
    }
}
