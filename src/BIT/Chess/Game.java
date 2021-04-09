package BIT.Chess;

import BIT.Chess.Figures.King;
import BIT.Chess.Figures.Queen;
import BIT.Chess.Types.Position;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Queen queen = new Queen(new Position('A', 3), "Black");
        King king = new King(new Position('B', 3 ), "Black");
        System.out.println(queen);
        System.out.println(king);
        System.out.println(Arrays.toString(king.possibleMoves()));
    }
}
