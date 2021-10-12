public class HomeWork2 {

    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        System.out.println(AddTwoNumber(7,2));
        PositiveNegative(x);
        System.out.println(BooleanPositiveNegative(7));
        int i = 1;
        for (i=1;i<=3;i++);
        Word("я могу", 1);
    }

    private static void Word(String я_могу, int i) {
        for (i=1;i<=3;i++) {
            System.out.println("Задание 4" + "я могу");
        }

    }

    public static boolean BooleanPositiveNegative(int a) {
        System.out.println("Задание 3");
        if (a < 0){ return true;
        }
        return false;
    }


    public static void PositiveNegative(int a) {
        System.out.println("Задание 2");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean AddTwoNumber(int a, int b) {
        System.out.println ("Задание 1");
        return (a+b > 10 && a+b<= 20);
    }
}
