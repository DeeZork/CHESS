public class Bishop extends ChessPiece {
    Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn) && Math.abs(toLine - line) == Math.abs(toColumn - column)){
            int dLine=(toLine-line)/Math.abs((toLine-line));
            int dColumn=(toColumn-column)/Math.abs(toColumn-column);
            for (int i=1; i<Math.abs(toLine - line);i++)
                if (!(chessBoard.board[line+dLine*i][column+dColumn*i]==null)) return false;
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
