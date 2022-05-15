public class SelectionSort {
    /**
     * Сортирует массив методом выбора
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Найти наименьшее значение в list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin < list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex], если необходимо
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}