public class Rook extends ChessPiece{
    Rook(String color) {
       super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn)&&((Math.abs(toLine-line)>0&&(toColumn-column)==0)||
                (Math.abs(toColumn-column)>0&&(toLine-line)==0)))
            return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
