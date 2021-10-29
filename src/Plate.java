public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(food);
    }

    public void decreaseFood(int appetite) {
        this.food = appetite;

        if (!enoughFood(appetite)) {
            System.out.println("Аппетит превышает количество еды в тарелке");
        } else {
            food = food - appetite;
        }
    }

    public void showInfo() {
        System.out.println("На тарелке " + food + " еды");
    }

    public boolean enoughFood(int appetite) {
        return appetite <= food;
    }
    public void increaseFood(int countOfFood)
    {
        food += countOfFood;
    }
}

