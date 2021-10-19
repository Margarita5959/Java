import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;

    public static void main(String[] args) {
        initMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();
            if (isWinner (DOT_X)){
                System.out.println ("Победил человек!");
                break;
            }
            if (isMapFull()){
                System.out.println ("Ничья");
                break;
            }
            aiTurn();
            showMap();
            if (isWinner (DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    private static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1));
            System.out.print((" "));
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]);
                System.out.print((" "));
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;

        Random myRandom = new Random();
        do {
            x = myRandom.nextInt(SIZE);
            y = myRandom.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точки: ");
        System.out.println("X- " + (x + 1));
        System.out.println("Y- " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isWinner(char symb) {
        for (int i=0; i< map.length; i++){
            int horizontal =0;
            int vertical =0;

            for (int j=0; j< map.length; j++){
                if (map [i][j]==symb){
                   horizontal++;
                }
                if (map [j][i]==symb){
                    vertical++;
                }
            }
            if (horizontal==DOTS_TO_WIN || vertical==DOTS_TO_WIN){
                return true;
            }
        }
        return false;
    }
    public static boolean isDiagonalWin (char symb){
        int mainDiagonal =0;
        int sideDiagonal =0;

        for (int i=0;i<DOTS_TO_WIN; i++){
            if (map [i][i] == symb){
                mainDiagonal++;
            }
            if (map [i][DOTS_TO_WIN-1-i]==symb){
                sideDiagonal++;
            }
        }
        return (mainDiagonal == DOTS_TO_WIN) || (sideDiagonal == DOTS_TO_WIN);
    }

    public static boolean isMapFull () {
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                if (map [i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}


