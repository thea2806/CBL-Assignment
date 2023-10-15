public class Cell {
    private int row;
    private int column;
    boolean hasMine; //De vzt daca se poate altcumva

    public Cell(int row, int column, boolean hasMine) {
        this.row = row;
        this.column = column;
        this.hasMine = hasMine;
    }
}
