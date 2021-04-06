package BIT.Mokiniai;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mokinys[] mokiniai = {
                new Mokinys("Jonas", "Jonaitis", 4),
                new Mokinys("Petras", "Petraitis", 2),
                new Mokinys("Marija", "Maryte", 3),
                new Mokinys("Jonas", "Kapitonas", 2),
                new Mokinys("Vardas", "Jonaitis", 3)
        };

        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " " + mokiniai[i].klase + " ");

        }
        System.out.println();

        Mokinys tuscias;

        for (int i = 0; i < mokiniai.length; i++) {
            for (int k = i + 1; k < mokiniai.length; k++) {
                if (compare(mokiniai[i], mokiniai[k])) {
                    tuscias = mokiniai[i];
                    mokiniai[i] = mokiniai[k];
                    mokiniai[k] = tuscias;
                }
            }
//            System.out.println(Arrays.toString(mokiniai));
        }
        System.out.println(Arrays.toString(mokiniai));
    }

    //    Funkcija, grazinanti true, jeigu a > b
    static boolean compare(Mokinys a, Mokinys b) {
//        Lyginam klases
        if (a.klase > b.klase) return true;
        else if (a.klase < b.klase) return false;
//        Lyginam pavardes, nes klases sitoj kodo eilutej yra lygios
        int result = a.pavarde.compareToIgnoreCase(b.pavarde);
//        if'as zemiau grazina tikrinimo rezultata, grazinimas ivyks, jei result nelygu nuliui
        if (result != 0) return result > 0;
//        jeigu result == 0 t.y. pavardes lygios:
        result = a.vardas.compareToIgnoreCase(b.vardas);

        return result > 0;
    }
}
