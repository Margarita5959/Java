public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void compareNumbers() {
        int a=20;
        int b=23;
        if (a>=b){
            System.out.println("a >= b");
        }
        if (a<b){
            System.out.println("a < b");
        }
    }

    public static void printColor() {
        int value=7;
        if (value<=0){
            System.out.println("Красный");
        }
        if (value>0 && value<=100){
            System.out.println("Желтый");
        }
        if (value>100){
            System.out.println("Зеленый");
        }
    }

    public static void checkSumSign() {
        int a=3;
        int b=-2;
        if(a+b>=0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}