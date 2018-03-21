package hashcode.qualification;

public class Coordinate {
  private int nRow;
  private int nCol;

  public Coordinate(int nRow, int nCol) {
    this.nRow = nRow;
    this.nCol = nCol;
  }

  @Override
  public String toString() {
    return "[" + nRow + "," + nCol + "]";
  }
}
