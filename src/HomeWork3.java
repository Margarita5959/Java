import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
Invert();
String[] arr = {"1", "0", "1", "0", "0", "1"};
System.out.println(Arrays.toString(arr));
OneHundred();
System.out.println(Arrays.toString(arr));
            }

    public static void OneHundred() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
                }
        System.out.println(Arrays.toString(arr));
            }


    public static void Invert() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] =1;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
