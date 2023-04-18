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
        boolean can=false;
        if (chessBoard.chekToPos(line, column, toLine, toColumn)&&Math.abs(toLine-line)==Math.abs(toColumn-column))
            can=true;
        return can;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
