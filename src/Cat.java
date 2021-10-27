public class Cat extends Animal {
    public Cat(float maxRunDistance) {
        super(maxRunDistance, Integer.MIN_VALUE);
    }
    @Override
    public void swim(float requiredDistance)
    {
        System.out.println("Кошки плавать не умеют!");
    }
}

