public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    private Human host;

    public Cat (String name, int appetite, Human host) {
        this.name = name;
        this.appetite = appetite;
        full = false;
        this.host = host;
    }
public void eat (Plate plate)
    {
        if (plate.enoughFood(appetite) && !full)
        {
            System.out.println(name + " кушает");
            plate.decreaseFood(appetite);
            full = true;
        }
        else if (!plate.enoughFood(appetite))
        {
            System.out.println("У " + name + " в миске нет еды");
            host.addFoodTo(plate, appetite);
        }
        else if (full)
        {
            System.out.println(name + " уже покушал");
        }
    }
}
