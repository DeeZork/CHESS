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
        boolean can=false;
        if (chessBoard.checkToPos(line, column, toLine, toColumn)&&
                ((Math.abs(toLine-line)==1||Math.abs(toColumn-column)==1)))
            can=true;
        return can;
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
