package BIT.DaugybosLentele;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Daugybos lentele");
        System.out.println();

//        for (int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 3; col++) {
//                System.out.print(row + " * " + col + " = " + row * col + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 4; col <= 6; col++) {
//                System.out.print(row + " * " + col + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 7; col <= 9; col++) {
//                System.out.print(row + " * " + col + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 3; i++) {
            for (int row = 1; row <= 10; row++) {
                for (int col = i * 3 + 1; col <= i * 3 + 1 + 2; col++) {
                    System.out.print(col + " * " +
                            (row < 10 ? " " : "") + row +  " = " +
                                    (col * row < 10 ? " " : "") + col * row + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
