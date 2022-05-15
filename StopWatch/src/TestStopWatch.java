import java.util.Date;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        double[] list = new double[100000];
        Random generation1 = new Random(1233);
        for (int i = 0; i < 100000; i++) {
            list[i] = generation1.nextInt(10);
        }
        StopWatch T1 = new StopWatch();

        SelectionSort.selectionSort(list);
        T1.stop();
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
        System.out.println("Время сортировки массива = " + T1.getElapsedTime() + " миллисекунд");

    }
}
