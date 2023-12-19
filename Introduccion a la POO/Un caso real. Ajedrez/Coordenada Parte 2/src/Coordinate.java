public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }
    int coordinate=0;
    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }
    public Coordinate up(){
        return new Coordinate(this.letter,this.number-1);


    }

    public Coordinate down(){
        return new Coordinate(this.letter,this.number+1);

    }

    public Coordinate left(){
        return new Coordinate((char)(this.letter-1),this.number);

    }

    public Coordinate right(){

        return new Coordinate((char)(this.letter+1),this.number);
    }

    public Coordinate diagonalUpLeft(){

      return this.up().left();
    }

    public Coordinate diagonalUpRight(){
        return this.up().right();
    }

    public Coordinate diagonalDownRight(){

        return this.down().right();
    }

    public Coordinate diagonalDownLeft(){
        return this.down().left();
    }


    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }

    //put your task here

}