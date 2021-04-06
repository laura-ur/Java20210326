package BIT.Mokiniai;

class Mokinys {
    String vardas;
    String pavarde;
    int klase;

    Mokinys() {
    }

    //            + klases Mokinys konstruktorius
    Mokinys(String vardas, String pavarde, int klase) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
    }

    @Override
    public String toString() {
        return + klase + " " + pavarde + " " + vardas;
    }

}