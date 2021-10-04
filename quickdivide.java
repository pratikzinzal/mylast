
class quickdivide {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int search = partition(array, low, high);
            quickSort(array, low, search - 1);
            quickSort(array, search + 1, high);
        }
    }

    public static void main(String[] args) {
        int N = 100;
        int[] arr1 = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            arr1[i] = N - i;
        }
        quickSort(arr1, 0, N - 1);

        System.out.println("sorted array is:");

        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }

    }

}