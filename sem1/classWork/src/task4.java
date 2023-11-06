import java.lang.reflect.Array;
import java.util.ArrayList;

public class task4 {

    public static ArrayList<Integer> simpleNums(int maxNum) {

        ArrayList<Integer> simplelist = new ArrayList<>();

        for (int i = 1; i <= maxNum; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                }
            }
            if (a) simplelist.add(i);

        }
        return simplelist;

    }
}
