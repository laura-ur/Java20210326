package BIT.Chess.Figures;

import BIT.Chess.Types.Position;

public class Queen extends Figure {
    public Queen(Position position, String color) {
        super(position, color);
    }

    /*public Queen(char letter, int number, String color) {
        super(letter, number, color);
    }*/

    @Override
    public String toString() {
        return "Queen : "+ position + ", " + color;
    }
}
