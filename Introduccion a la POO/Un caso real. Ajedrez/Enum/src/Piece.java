
public class Piece {

    private Type type;

    public Piece(Type type) {
        this.type = type;
    }

    public enum Color {
        WHITE("Blanco"), BLACK("Negro");
        private String color;
        Color(String text){
            this.color=text;
        }
        public String getColor(){
            return color;
        }
    }

    public enum Type {
        WHITE_KING("WHITE_KING",Color.WHITE),
        WHITE_QUEEN("WHITE_QUEEN",Color.WHITE),
        WHITE_ROOK("WHITE_ROOK",Color.WHITE),
        WHITE_BISHOP("WHITE_BISHOP",Color.WHITE),
        WHITE_KNIGHT("WHITE_KNIGHT",Color.WHITE),
        WHITE_PAWN("WHITE_PAWN",Color.WHITE),
        BLACK_KING("BLACK_KING",Color.BLACK),
        BLACK_QUEEN("BLACK_QUEEN",Color.BLACK),
        BLACK_ROOK("BLACK_ROOK",Color.BLACK),
        BLACK_BISHOP("BLACK_BISHOP",Color.BLACK),
        BLACK_KNIGHT("BLACK_KNIGHT",Color.BLACK),
        BLACK_PAWN("BLACK_PAWN",Color.BLACK);
        private String shape;
        private Color color;
        Type(String shape,Color color){
            this.shape=shape;
            this.color=color;
        }

        public String getShape(){
            return shape;
        }

        public Color getColor(){
            return color;
        }
        //put your task here

    }

}

