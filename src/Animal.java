public class Animal {
    private float maxRunDistance;
    private float maxSwimDistance;

    public Animal(float maxRunDistance, float maxSwimDistance)
    {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public void run(float requiredDistance)
    {
        if (requiredDistance > maxRunDistance)
        {
            System.out.println("Не может пробежать " + requiredDistance);
            System.out.println("Максимальная возможность: " + maxRunDistance);
        }
        else
        {
            System.out.println("Дистанция бега " + requiredDistance + " выполнено");
        }

        System.out.println();
    }

    public void swim(float requiredDistance)
    {
        if (requiredDistance > maxSwimDistance)
        {
            System.out.println("Не может проплыть " + requiredDistance);
            System.out.println("Максимальная возможность: " + maxRunDistance);
        }
        else
        {
            System.out.println("Дистанция заплыва " + requiredDistance + " выполнено");
        }

        System.out.println();
    }
}

