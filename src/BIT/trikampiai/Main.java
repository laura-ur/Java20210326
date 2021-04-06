package BIT.trikampiai;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Iveskite trikampio krastines ir spauskite enter:");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int p = (a + b + c) / 2;
        double plotas = Math.sqrt(p * (p - a) * (p - b) * (p - c));


// tikrinam ar trikampis
        if (a + b <= c || a + c <= b || c + b <= a) {
            System.out.println("Tai ne trikampis");

// tikrinam ar lygiakrastis
        } else if (a == b && b == c) {
            System.out.println("Tai lygiakrastis trikampis, kurio plotas = " + plotas);

// tikrinam ar lygiasonis
        } else if (a == b || a == c || c == b) {
            System.out.println("Tai lygiasonis trikampis, kurio plotas = " + plotas);

// tikrinam ar ivairiakrastis
        } else if (a != b && b != c) {
            System.out.println("Tai ivairiakrastis trikampis, kurio plotas = " + plotas);

        }

    }
}
