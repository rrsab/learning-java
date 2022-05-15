import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        int rowArray; // количество строк массива
        int columnsArray; // количество столбцов массива


        Scanner input = new Scanner(System.in);

        //Получить количество строчек и столбцов массива:
        System.out.print("Введите количество строчек и столбцов массива: ");
        rowArray = input.nextInt();
        columnsArray = input.nextInt();

        double[][] array = new double[rowArray][columnsArray]; // массив элементов

        //Получение массива
        System.out.println("Введите массив:");
        inputArray(array);
        printArray(array); // Печать массива
        Location locateElement = Location.locateLargest(array);
        // Вывод результата
        System.out.println("Наибольший элемент массива, равный " + Location.maxValue +
                ", находится в позиции (" + Location.row + ", " + Location.column + ")");

    }
    public static void inputArray(double[][] a) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
            //System.out.println();
        }
    }
    public static void printArray(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
