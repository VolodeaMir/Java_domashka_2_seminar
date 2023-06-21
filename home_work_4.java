// 4) Отвалидировать доску судоку
// /Требования
// Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
// 1. Каждая строка должна содержать цифру 1-9 без повторения
// 2. Каждая колонка должна содержать цифру 1-9 без повторения
// 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
// Ограничения
// • board.length == 9
// • board[i].length == 9
// • board[i][j] значение число или '.'
// */
// public class Main {
// public static void main(String[] args) {
// char[][] board = {
// {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
// {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
// {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
// {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
// {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
// {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
// {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
// {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
// {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

//     System.out.println("Validete:" + isValidSudoku(board));  }
public class home_work_4 {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println("Validate: " + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        // Проверка строк
        for (int row = 0; row < 9; row++) {
            if (!isValidRow(board, row)) {
                return false;
            }
        }

        // Проверка столбцов
        for (int col = 0; col < 9; col++) {
            if (!isValidColumn(board, col)) {
                return false;
            }
        }

        // Проверка подблоков
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isValidSubgrid(board, row, col)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] visited = new boolean[9];
        for (int col = 0; col < 9; col++) {
            char digit = board[row][col];
            if (digit != '.') {
                int num = digit - '0';
                if (visited[num - 1]) {
                    return false;
                }
                visited[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] visited = new boolean[9];
        for (int row = 0; row < 9; row++) {
            char digit = board[row][col];
            if (digit != '.') {
                int num = digit - '0';
                if (visited[num - 1]) {
                    return false;
                }
                visited[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubgrid(char[][] board, int startRow, int startCol) {
        boolean[] visited = new boolean[9];
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                char digit = board[row][col];
                if (digit != '.') {
                    int num = digit - '0';
                    if (visited[num - 1]) {
                        return false;
                    }
                    visited[num - 1] = true;
                }
            }
        }
        return true;
    }
}
