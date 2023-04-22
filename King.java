public class King extends ChessPiece {
    King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn) &&
                ((Math.abs(toLine - line) < 2 && Math.abs(toColumn - column) < 2)) &&
                !isUnderAttack(chessBoard, toLine, toColumn)) return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++)
            for (int k = 0; k < 8; k++) {
                if (board.board[i][k]==null) continue;
                if (board.nowPlayer.equals(board.board[i][k].getColor())) continue;
                if (board.board[i][k].canMoveToPosition(board, i, k, line, column)) return true;
            }
        return false;
    }
}
