package BIT.Chess.Figures;

import BIT.Chess.Types.Position;

import java.util.Arrays;

public class King extends Figure {
    public King(Position position, String color) {
        super(position, color);
    }

    @Override
    public String toString() {
        return "King : " + position + ", " + color;
    }

    /*   ... C D E ...
        4    * * *
        5    * K *
        6    * * *
     */
    public Position[][] possibleMoves() {
//
//        Position[] positions = new Position[]{
//                new Position((char)(position.getLetter() - 1), position.getNumber() - 1),
//                new Position(position.getLetter(), position.getNumber() - 1),
//                new Position((char)(position.getLetter() + 1), position.getNumber() - 1),
//                new Position((char)(position.getLetter() - 1), position.getNumber() ),
//                new Position((char)(position.getLetter() + 1), position.getNumber() ),
//                new Position((char)(position.getLetter() - 1), position.getNumber() + 1),
//                new Position(position.getLetter(), position.getNumber() + 1),
//                new Position((char)(position.getLetter() + 1), position.getNumber() + 1),
//
//        };
//        Position[] positions = new Position[9];
//        for (int k = position.letter - 1; k < position.letter + 1; k++) {
//            for (int i = position.number - 1; i < position.number + 1; i++) {
//                new Position((char)(k), i);
//            }
//
//        }
        Position[][] positions = new Position[3][3];
        for (int i = position.getLetter() - 1; i <= position.getLetter() + 1; i++){
            for (int j = position.getNumber() - 1; j <= position.getNumber() + 1; j++){
                System.out.println(Arrays.toString(positions));
//                 positions = positions + positions[i][j];
            }

        }
            return positions;
    }

//    private Position getKingPosition(Position kingPosition) {
//        return kingPosition;
//    }

}
