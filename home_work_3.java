// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
// Пример:
// Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
// Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
// Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}

public class home_work_3 {
    public static void main(String[] args) {
        int[] array = { 1, 22, 33, 44, 5, -5, -3, 23, -7 }; // Здесь можно изменить массив

        int sumOfIndices = calculateSumOfIndices(array);
        replaceNegativeElements(array, sumOfIndices);

        System.out.println("Массив после замены отрицательных на сумму:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int calculateSumOfIndices(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                sum += i;
            }
        }
        return sum;
    }

    public static void replaceNegativeElements(int[] array, int replacement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = replacement;
            }
        }
    }
}
