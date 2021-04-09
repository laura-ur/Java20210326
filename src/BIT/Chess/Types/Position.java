package BIT.Chess.Types;

public class Position {
    private char letter;
    private int number;

    public Position(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + letter + number;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

}
