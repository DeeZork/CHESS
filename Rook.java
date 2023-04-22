public class Rook extends ChessPiece {
    Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int dLine = toLine - line;
        int dColumn = toColumn - column;
        if (chessBoard.checkToPos(line, column, toLine, toColumn) &&
                ((Math.abs(dLine) > 0 && (dColumn) == 0) || (Math.abs(dColumn) > 0 && (dLine) == 0))) {
            if (dLine != 0) dLine = dLine / Math.abs(dLine);
            if (dColumn != 0) dColumn = dColumn / Math.abs(dColumn);
            for (int i = 1; i < Math.abs(toLine - line+toColumn - column); i++)
                if (!(chessBoard.board[line + dLine * i][column + dColumn * i] == null)) return false;
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
