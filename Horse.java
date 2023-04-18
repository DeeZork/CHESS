public class Horse extends ChessPiece {
    Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean can = false;
        if (chessBoard.checkToPos(line, column, toLine, toColumn))
            switch (Math.abs(toLine - line)) {
                case 1:
                    if (Math.abs(toColumn - column) == 3)
                        can = true;
                    break;
                case 3:
                    if (Math.abs(toColumn - column) == 1)
                        can = true;
            }
        return can;
    }
        @Override
        public String getSymbol () {
            return "H";
        }
    }
