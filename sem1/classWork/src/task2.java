
public class task2 {

    static int count = 0;

    public static int combo(int cubes, int edges) {
        if (cubes == 1)
            return count;
        for (int i = 0; i < edges; i++) {
            for (int j = 0; j < edges; j++) {
                for (int k = 0; k < edges; k++) {
                    for (int k2 = 0; k2 < edges; k2++) {
                        count++;
                    }

                }

            }

        }
        return combo(--cubes, edges);
    }

}
