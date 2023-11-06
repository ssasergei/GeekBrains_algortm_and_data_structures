
public class task1 {
    
    public static int summ(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i + i + 1;
        }
        return sum;
    }
}
