public class Human {
    public void addFoodTo(Plate plate, int food) {
        System.out.println("Хозяин добавляет еду");
        plate.increaseFood(food);
    }

}
