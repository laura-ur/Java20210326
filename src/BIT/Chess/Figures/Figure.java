package BIT.Chess.Figures;

import BIT.Chess.Types.Position;

public class Figure {
    Position position;
    String color;

//    public Figure(char letter, int number, String color) {
////        this.letter = letter;
////        this.number = number;
//        this.position = new Position(letter, number);
//        this.color = color;
//    }

    public Figure(Position position, String color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: "+ position + ", " + color;
    }

    public Position[][] possibleMoves(){
        return null;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
