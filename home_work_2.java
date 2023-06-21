// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class home_work_2 {
    public static void main(String[] args) {
        int[] sequence = { 1, 2, 3, 4, 5 }; // Здесь можно изменить последовательность чисел

        boolean isIncreasing = checkIfSequenceIsIncreasing(sequence);

        if (isIncreasing) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность не является возрастающей.");
        }
    }

    public static boolean checkIfSequenceIsIncreasing(int[] sequence) {
        int n = sequence.length;

        for (int i = 1; i < n; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
