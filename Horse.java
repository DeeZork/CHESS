public class Horse extends ChessPiece{
    Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return line!=toLine&&line>0&&line<8&&column!=toColumn&&column>0&&column<8;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
