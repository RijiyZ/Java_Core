package driver;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean license;
    private int experience;

    private String category;



    public Driver(String fullName, boolean license, int experience, String category) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Фамилия Имя Отчество";
        } else {
            this.fullName = fullName;
        }
        this.license = license;
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
        setCategory(category);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Фамилия Имя Отчество";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }
    public String getCategory() {
        return category;
    }
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();

    public void setCategory(String category) {
        if (category == null || category.isEmpty()) {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительского удостоверения для водителя - " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriversLicenceException("Driver's licence category have to be specified" +
                        " for the driver " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return license == driver.license && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName +
                ", опыт " + experience + " лет \n";
    }
}
