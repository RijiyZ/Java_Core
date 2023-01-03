package driver;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean license;
    private int experience;



    public Driver(String fullName, boolean license, int experience) {
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
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();

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
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", license=" + license +
                ", experience=" + experience +
                '}';
    }
}
