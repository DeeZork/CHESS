public class King extends ChessPiece{
    King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn)&&
                ((Math.abs(toLine-line)<2&&Math.abs(toColumn-column)<2))&&
                !isUnderAttack(chessBoard,toLine,toColumn)) return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
//        вызвать в цикле метод canMoveToPosition для каждой фигуры на доске противоположного цвета
        return false;
    }
}
