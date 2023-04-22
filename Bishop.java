public class Bishop extends ChessPiece{
    Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn)&&Math.abs(toLine-line)==Math.abs(toColumn-column))
            return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
