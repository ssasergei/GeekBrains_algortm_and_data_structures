import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        // int[] arrey = { 9, 77, 3, 1, 8, 4, 16 };
        int[] arrey = new int[100000000];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = random.nextInt(10000000);
        }

        long start = System.currentTimeMillis();
        // sort.bubleSort(arrey);
        // System.out.println(System.currentTimeMillis() - start);

        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = random.nextInt(10000000);
        }
        start = System.currentTimeMillis();
        sort.quicgSort(arrey, 0, arrey.length -1);
        System.out.println(System.currentTimeMillis() - start);

         for (int i = 0; i < arrey.length; i++) {
            arrey[i] = random.nextInt(10000000);
        }
        start = System.currentTimeMillis();
        sort.heapSort(arrey);
        System.out.println(System.currentTimeMillis() - start);



        // System.out.println(Arrays.toString(arrey));
        // System.out.println(sort.binarySearch(arrey, 10));

        
    }
}
