import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardSize = 8;

        System.out.print("Введіть поточну позицію (стовпець рядка): ");
        int currentRow = scanner.nextInt();
        int currentCol = scanner.nextInt();

        System.out.print("Введіть цільову позицію (стовпець рядка): ");
        int targetRow = scanner.nextInt();
        int targetCol = scanner.nextInt();

        if (isValidPosition(currentRow, currentCol, boardSize) && isValidPosition(targetRow, targetCol, boardSize)) {
            if (isKnightMove(currentRow, currentCol, targetRow, targetCol)) {
                System.out.println("The knight can make the move.");
            } else {
                System.out.println("Invalid knight move.");
            }
        } else {
            System.out.println("Invalid positions on the chessboard.");
        }

        scanner.close();
    }

    public static boolean isValidPosition(int row, int col, int boardSize) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize;
    }

    public static boolean isKnightMove(int currentRow, int currentCol, int targetRow, int targetCol) {
        int rowDiff = Math.abs(targetRow - currentRow);
        int colDiff = Math.abs(targetCol - currentCol);
        return (rowDiff == 1 && colDiff == 2) || (rowDiff == 2 && colDiff == 1);
    }
}