
public class task3 {

    /**
     * Расчет через рекурсию
     */
    public static int fib_recu(int position) {
        if (position == 1 || position == 2)
            return 1;
        return fib_recu(position - 1) + fib_recu(position - 2);
    }

     /**
     * Расчет через линейную функцию.
     */
    public static int fib(int pos) {
        int f = 0;
        int a = 1;
        int b = 1;
        for (int i = 2; i < pos; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }
}
