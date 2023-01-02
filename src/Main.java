public class Main {
    public static void main(String[] args) {
        int currentYear = 2023;
        Human max = new Human();
        max.name = "Максим";
        max.age = 35;
        max.city = "Минск";

        Human ann = new Human();
        ann.name = "Аня";
        ann.age = 29;
        ann.city = "Москва";

        Human kate = new Human();
        kate.name = "Катя";
        kate.age = 28;
        kate.city = "Калининград";

        Human art = new Human();
        art.name = "Артем";
        art.age = 27;
        art.city = "Москва";
        System.out.println("Привет! Меня зовут " + max.name + ". Я из города " + max.city + ". Я родился в " + (currentYear - max.age) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + ann.name + ". Я из города " + ann.city + ". Я родился в " + (currentYear - ann.age) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + art.name + ". Я из города " + art.city + ". Я родился в " + (currentYear - art.age) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + kate.name + ". Я из города " + kate.city + ". Я родился в " + (currentYear - kate.age) + " году. Будем знакомы!");
    }
}