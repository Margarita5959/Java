public class Main {
    public static void main(String[] args) {
        Human host = new Human();
        Cat[] cats = {
                new Cat("Барсик", 7, host),
                new Cat("Космос", 12, host),
                new Cat("Том", 10, host)
        };
        Plate plate = new Plate(10);

        plate.showInfo();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}
