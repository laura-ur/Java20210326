package BIT.Mokiniai;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mokinys[] mokiniai = {
                new Mokinys("Jonas", "Jonaitis", 4, new int[]{4, 5, 6}),
                new Mokinys("Petras", "Petraitis", 2, new int[]{8, 7, 9}),
                new Mokinys("Marija", "Maryte", 3, new int[]{10, 6, 5}),
                new Mokinys("Jonas", "Kapitonas", 2, new int[]{1, 6, 9}),
                new Mokinys("Vardas", "Jonaitis", 3, new int[]{10, 10, 10}),
                new Mokinys("Antanas", "Antanaitis", 4, new int[]{2, 3, 4}),
                new Mokinys("Antanas", 4, new int[]{2, 3, 4}),

        };
        System.out.println(Arrays.toString(mokiniai));

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
        }
        System.out.println(Arrays.toString(mokiniai));
    }

    //    Funkcija, grazinanti true, jeigu a > b
    static boolean compare(Mokinys a, Mokinys b) {
//        Lyginam klases
        if (a.klase > b.klase) return true;
        else if (a.klase < b.klase) return false;
//        Lyginam vidurkius
        if(a.vidurkis() < b.vidurkis()) return true;
        else if (a.vidurkis() > b.vidurkis()) return false;

////        Lyginam pavardes, nes klases sitoj kodo eilutej yra lygios
//        int result = a.pavarde.compareToIgnoreCase(b.pavarde);
////        if'as zemiau grazina tikrinimo rezultata, grazinimas ivyks, jei result nelygu nuliui
//        if (result != 0) return result > 0;
////        jeigu result == 0 t.y. pavardes lygios:
//        result = a.vardas.compareToIgnoreCase(b.vardas);
//
        return a.vidurkis() > b.vidurkis();
    }
}
