public class Queen extends ChessPiece{
    Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can=false;
        if (chessBoard.chekToPos(line, column, toLine, toColumn)&&
                ((Math.abs(toLine-line)>0&&(toColumn-column)==0)||
                (Math.abs(toColumn-column)>0&&(toLine-line)==0)||
                (Math.abs(toLine-line)==Math.abs(toColumn-column))))
            can=true;
        return can;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
