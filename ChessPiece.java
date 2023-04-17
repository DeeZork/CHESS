public abstract class ChessPiece {
    String color;
    Boolean check=true;

    ChessPiece(String color){}
    public abstract String getColor();
    public abstract boolean(ChessBoard chessBoard,
                            int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();
}
