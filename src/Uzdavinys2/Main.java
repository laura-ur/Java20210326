package Uzdavinys2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 1; j++) {
                int two = 2;
                int three = 3;
                int four = 4;
                int result = i * two;
                int result1 = i * three;
                int result2 = i * four;
                System.out.printf("%-15.12s %-15.12s %-15.12s%n", two + " * " + i + " = " + result, +three + " * " + i + " = " + result1, four + " * " + i + " = " + result2);
            }
        }
        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 1; j++) {
                int five = 5;
                int six = 6;
                int seven = 7;
                int result = i * five;
                int result1 = i * six;
                int result2 = i * seven;
                System.out.printf("%-15.12s %-15.12s %-15.12s%n", five + " * " + i + " = " + result, +six + " * " + i + " = " + result1, seven + " * " + i + " = " + result2);
            }
        }
        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 1; j++) {
                int eight = 8;
                int nine = 9;
                int result = i * eight;
                int result1 = i * nine;
                System.out.printf("%-15.12s %-15.12s%n", eight + " * " + i + " = " + result, +nine + " * " + i + " = " + result1);
            }

        }
    }
}