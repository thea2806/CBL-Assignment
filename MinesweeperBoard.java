import java.util.Random;

public class MinesweeperBoard {
    Cell[][] board;
    int sizeRow;
    int sizeColumn;

    public MinesweeperBoard(int sizeRow, int sizeColumn) {
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                board[i][j] = new Cell(i, j, false);
            }
        }
        this.sizeRow =sizeRow;
        this.sizeColumn = sizeColumn;
    }

    void generateMines(Cell board[][], int minesNum) {
        int rows = sizeRow;
        int columns = sizeColumn;
        Random random = new Random();
        for (int i = 0; i < minesNum; i++) {
            int row;
            int col;
            do{
                row = random.nextInt(rows);
                col = random.nextInt(columns);
                
            } while(board[row][col].hasMine);
            board[row][col].hasMine = true;
        }
    }

    public int neighborMines(Cell cell) {
        return 0;
    }
}
