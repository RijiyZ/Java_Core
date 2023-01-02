package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres,
               Key key,
               Insurance insurance) {
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
        if (productionCountry == null){
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null){
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.engineVolume = engineVolume;
        this.productionYear = productionYear;
        if (typeOfBody == null){
            this.typeOfBody = "Sedan";
        } else {
            this.typeOfBody = typeOfBody;
        }
        if (regNumber == null){
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        if (gears == null){
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
        if (key == null){
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null){
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.seatsCount = seatsCount;
        this.summerTyres = summerTyres;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry
               ) {
       this(
               brand,
               model,
               engineVolume,
               color,
               productionYear,
               productionCountry,
               "МКПП",
               "Sedan",
               "х000хх000",
               5,
               true,
               new Key(),
               new Insurance()
       );
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null){
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null){
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }
    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber(){
        //x000xx000
        if (regNumber.length() != 9){
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Key {
        private final boolean renoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean renoteRunEngine, boolean withoutKeyAccess) {
            this.renoteRunEngine = renoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRenoteRunEngine() {
            return renoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {

        private final LocalDate expineDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expineDate, double cost, String number) {
            if (expineDate == null) {
                this.expineDate = LocalDate.now().plusDays(365);
            } else {
                this.expineDate = expineDate;
            }
            this.cost = cost;
            if (number == null){
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpineDate() {
            return expineDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpineDay() {
            if (expineDate.isBefore(LocalDate.now()) || expineDate.isEqual(LocalDate.now())){
                System.out.println("Нужно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber () {
            if (number.length() != 9){
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

}
