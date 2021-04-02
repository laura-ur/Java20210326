package BIT.Mokiniai;

public class Main {
    public static void main(String[] args) {

        class Mokinys {
            String vardas;
            String pavarde;
            int klase;

            //            + klases Mokinys konstruktorius
            Mokinys(String vardas, String pavarde, int klase) {
                this.vardas = vardas;
                this.pavarde = pavarde;
                this.klase = klase;
            }

        }

        Mokinys[] mokiniai = {
                new Mokinys("Jonas", "Jonaitis", 1),
                new Mokinys("Petras", "Petraitis", 2),
                new Mokinys("Marija", "Antuanete", 3),
                new Mokinys("Zibute", "Pavasaryte", 2),
                new Mokinys("Jonas", "Kalafioras", 2),
                new Mokinys("Satrijos", "Ragana", 1),
                new Mokinys("Liepa", "Birzelyte", 3),
                new Mokinys("Vardas", "Jonaitis", 3)
        };

        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " " + mokiniai[i].klase + " ");

        }
        System.out.println();

        System.out.println();

        for (int i = 0; i < mokiniai.length; i++) {
            for (int k = i + 1; k < mokiniai.length; k++) {
                if (mokiniai[i].pavarde.compareTo(mokiniai[k].pavarde) > 0) {
                    String tuscias = mokiniai[i].pavarde;
                    mokiniai[i].pavarde = mokiniai[k].pavarde;
                    mokiniai[k].pavarde = tuscias;

                }

            }
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " " + mokiniai[i].klase + " ");
        }
        System.out.println();

        for (int i = 0; i < mokiniai.length; i++) {
            for (int k = i + 1; k < mokiniai.length; k++) {
                if (mokiniai[i].vardas.compareTo(mokiniai[k].vardas) > 0) {
                    String tuscias = mokiniai[i].vardas;
                    mokiniai[i].vardas = mokiniai[k].vardas;
                    mokiniai[k].vardas = tuscias;

                }

            }
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " " + mokiniai[i].klase + " ");
        }
        System.out.println();

        for (int i = 0; i < mokiniai.length; i++) {
            for (int k = i + 1; k < mokiniai.length; k++) {
                if (mokiniai[i].klase > mokiniai[k].klase) {
                    int tuscias = mokiniai[i].klase;
                    mokiniai[i].klase = mokiniai[k].klase;
                    mokiniai[k].klase = tuscias;

                }

            }
            System.out.println(mokiniai[i].vardas + " " + mokiniai[i].pavarde + " " + mokiniai[i].klase + " ");
        }
    }
}
