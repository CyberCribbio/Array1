
import java.util.Arrays;

public class Start {
    public Start() {
    }

    public static void main(String[] args) {
        String[] carBrands = new String[]{"Skoda", "Ferrari", "Mercedes", "Alfa Romeo", "Ford"};
        System.out.println("The number of items in carBrands array is " + carBrands.length);
        System.out.println("----------------");
        System.out.println("The third item of carBrands array is the brand: " + carBrands[2]);
        System.out.println("----------------");
        int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13};
        System.out.println("This is the populated primeNumbers array: " + Arrays.toString(primeNumbers));
    }
}
