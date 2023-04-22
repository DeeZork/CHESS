public class Horse extends ChessPiece {
    Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkToPos(line, column, toLine, toColumn))
            switch (Math.abs(toLine - line)) {
                case 1:
                    if (Math.abs(toColumn - column) == 2)
                        return true;
                case 2:
                    if (Math.abs(toColumn - column) == 1)
                        return true;
            }
        return false;
    }
        @Override
        public String getSymbol () {
            return "H";
        }
    }
