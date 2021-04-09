package BIT.Mokiniai;

public class Zmogus {
    String vardas;
    String pavarde;

    public Zmogus() {

    }

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
    public Zmogus(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }
}
