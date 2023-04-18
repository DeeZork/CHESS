public class Pawn extends ChessPiece{
    Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can = false;
        if (chessBoard.checkToPos(line, column, toLine, toColumn))
            switch (toLine-line){
                case 2:
                    if (color.equals("White")&&line==1) can=true;
                    break;
                case 1:
                    if (color.equals("White")&&line>=1) can=true;
                    break;
                case -2:
                    if (color.equals("Black")&&line==6) can=true;
                    break;
                case -1:
                    if (color.equals("Black")&&line<=6) can=true;
                    break;
            }
        return can;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
