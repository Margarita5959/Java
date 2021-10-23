import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Задание1");
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        Invert(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Задание2");
        int[] secondArr = new int[100];
        System.out.println(Arrays.toString(secondArr));
        OneHundred(secondArr);
        System.out.println(Arrays.toString(secondArr));
        System.out.println("Задание3");
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdArr));
        MultiplayByTwo(thirdArr);
        System.out.println(Arrays.toString(thirdArr));
        System.out.println("Задание4");
        int[][] square = new int[5][5];
        printArray (square, square);
        System.out.println("Задание5");
        int initialValue = 8;
        int len = 3;
        int[] fourthArr = newArray(initialValue, len);
        System.out.println(Arrays.toString(fourthArr));
    }

    private static int[] newArray(int initialValue, int len) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = initialValue;
        }
        return result;
    }

    private static void printArray(int[][] arr, int[][] square) {
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("");
                square[i][i] = 1;
                square[i][square[i].length - 1 - i] = 1;
                           }
            System.out.println();
        }
    }


    private static void MultiplayByTwo(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++);
        int i=0;
        if (inputArray[i] <6)
            inputArray[i] *= 2;
        }

    public static void OneHundred(int []arr) {
        int[] secondArr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }

    public static void Invert(int[] inputArray) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
            }
            System.out.println(Arrays.toString(arr));
        }

    }



