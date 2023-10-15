import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinesweeperBoardTest {
    MinesweeperBoard level1 = new MinesweeperBoard(9, 9);
    MinesweeperBoard level2 = new MinesweeperBoard(16, 16);
    MinesweeperBoard level3 = new MinesweeperBoard(16, 30);

    @Test
    public void neighborMinesTest() {
        Cell test1 = level1.board[4][5];
        level1.board[3][4].hasMine = true;
        level1.board[4][6].hasMine = true;
        int expectedResult1 = 2;
        assertEquals(expectedResult1, level1.neighborMines(test1));
    }

}
