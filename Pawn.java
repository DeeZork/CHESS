public class Pawn extends ChessPiece {
    Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn))
            switch (toLine - line) {
                case 2:
                    if (color.equals("White") && line == 1 && column == toColumn) return true;
                    break;
                case 1:
                    if (color.equals("White") && column == toColumn && chessBoard.board[toLine][toColumn] == null) return true;
                    if (color.equals("White") && Math.abs(column - toColumn) == 1) return true;
                    break;
                case -2:
                    if (color.equals("Black") && line == 6 && column == toColumn) return true;
                    break;
                case -1:
                    if (color.equals("Black") && column == toColumn && chessBoard.board[toLine][toColumn] == null) return true;
                    if (color.equals("Black") && Math.abs(column - toColumn) == 1) return true;
            }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
