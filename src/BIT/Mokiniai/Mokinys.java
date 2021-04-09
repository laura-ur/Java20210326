package BIT.Mokiniai;

import java.text.DecimalFormat;

class Mokinys extends Zmogus {
    int klase;
    int[] trimestras;

    Mokinys() {
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        super(vardas, pavarde);
        this.klase = klase;
        this.trimestras = trimestras;
    }
    Mokinys(String vardas, int klase, int[] trimestras) {
        super(vardas);
        this.klase = klase;
        this.trimestras = trimestras;
    }

    //    _____________________________________________-
    public double vidurkis() {
        double viso = 0.0;
        for (int i = 0; i < trimestras.length; i++) {
            viso = viso + trimestras[i];
        }
        double vidurkis = viso / trimestras.length;
        DecimalFormat a = new DecimalFormat("##.00");
        return Double.parseDouble(a.format(vidurkis));
    }

    //_____________________________________________________-
    @Override
    public String toString() {
        return +klase + " " + pavarde + " " + vardas + " " + vidurkis();
    }

}