public class Main {
    public static void main(String[] args)
    {

        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        cat.run(110);
        cat.swim(7);

        dog.run(520);
        dog.swim(7);

    }
}

