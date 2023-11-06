// Класс сортировк  и

public class sort {

    // Пузарковая сортировка

    public static void bubleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    // Быстрая сортировка
    public static void quicgSort(int[] arr, int left, int ringht) {
        if (arr == null || arr.length == 0 || left >= ringht)
            return;
        int pivot = (ringht - left) / 2 + left;
        int midPoint = arr[pivot];
        int l = left;
        int r = ringht;
        while (l <= r) {
            while (arr[l] < midPoint)
                l++;
            while (arr[r] > midPoint)
                r--;
            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        if (left < r)
            quicgSort(arr, left, r);
        if (ringht > l)
            quicgSort(arr, l, ringht);
    }

    // Бинарная поиск
    public static int binarySearch(int[] arr, int nunber) {
        int left = 0;
        int ringht = arr.length;
        int index = -1;
        while (left <= ringht) {
            int pivot = (ringht - left) / 2 + left;
            if (arr[pivot] < nunber) {
                left = pivot + 1;
            } else if (arr[pivot] > nunber) {
                ringht = pivot - 1;
            } else if (arr[pivot] == nunber) {
                index = pivot;
                break;
            }
        }
        return index;
    }

    // Пиромидная сортировка
    public static void heapSort(int[] arr){
        //  Постороение кучи (перегрупируем массив)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, i , arr.length);

        for (int i = arr.length - 1; i >= 0; i-- ){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex; // нициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1;  //Левая пирамида
        int ringhtChild = 2 * rootIndex + 2;  //Правая пирамида

        // Если левая дочерний элемент больше корня
        if (leftChild < heapSize && arr[leftChild] > arr[largest]) 
            largest = leftChild;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (ringhtChild < heapSize && arr[ringhtChild] > arr[largest])
            largest = ringhtChild;
        
        // Если самый большой элемент не корень
        if (largest != rootIndex){
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            // Рекурсивно преобразунм в двоичную кучу затронутое поддерево
            heapify(arr, heapSize, largest); 
        }        
    } 
}
