package BIT.Gatves;

public class Main {
    public static void main(String[] args) {
//        kas apraso gatve?
//        Vienos gatves pozymiai:
//        - kodas;
//        - pavadinimas;
//        - masyvas - kilometras;
//        - masyvas - plotis ( t.y kiek juostu);
//
//        pvz:

//        kodas:       10
//        pavadinimas: Laisves al.
//        kilometras:  {2km,      3.4km,      5.9km}
//        plotis:      {2juostos, 2juostos, 6juostos}
//
//        kaip reiktu verstis, jeigu neturetume klasiu
        int[] kodai = {10, 11, 12};
        String[] pavadinimai = {"Laisves al.", "Vytauto pr.", "Maironio g."};
        double[][] km = {
                {2, 3.4, 5.9},
                {0.0, 0.5, 0.75, 1.2, 3.4},
                {0.0, 0.3, 1.1, 1.8}
        };
        int[][] plotis = {
                {2, 2, 6},
                {5, 4, 4, 4, 6},
                {2, 2, 2, 2}

        };

//        galima nesunkiai atsispausdint: kodai.length, nes kiek pas mane yra kodu,
//        tiek pavadinimu, km masyvu ir plocio masyvu. Turi atitikt

        for (int i = 0; i < kodai.length; i++) {
            System.out.print(kodai[i] + " " + pavadinimai[i] + ", sankryzos: ");
            for (int k = 0; k < km[i].length; k++) {
                System.out.print(km[i][k] + " (" + plotis[i][k] + "),");
            }
            System.out.println();
        }
        System.out.println();
//        Tokiu budu dirbti su duomenimis yra nepatogu,
//        buvo sugalvotos STRUKTUROS !!!:

//        vienos gatves struktura (planas)
//        struktura turi buti parasyta auksciau, nei vieta kur jinai panaudota


//        siuo atveju kintamojo tipas yra klase Gatve:
//        1. va taip sukuriam nauja objekta, kurio tipas gatve:
        Gatve gatve = new Gatve();
//        2. Priskiriam gatvei reiksmes:
        gatve.kodas = 10;
        gatve.pavadinimas = "Laisves al.";
        gatve.sankryzos = new Sankryza[3];
        gatve.sankryzos[0] = new Sankryza();
        gatve.sankryzos[0].km = 2.0;
        gatve.sankryzos[0].plotis = 2;
        gatve.sankryzos[1] = new Sankryza();
        gatve.sankryzos[1].km = 3.4;
        gatve.sankryzos[1].plotis = 2;
        gatve.sankryzos[2] = new Sankryza();
        gatve.sankryzos[2].km = 5.9;
        gatve.sankryzos[2].plotis = 6;

        System.out.print(gatve.kodas + " " + gatve.pavadinimas);
        for (int i = 0; i < gatve.sankryzos.length; i++) {
            System.out.print(gatve.sankryzos[i].km + " (" + gatve.sankryzos[i].plotis + "), ");

        }
        System.out.println();

        Gatve[] gatves = {
                new Gatve(10, "Laisves al.", new Sankryza[]{
                        new Sankryza(2.0, 2),
                        new Sankryza(3.4, 2),
                        new Sankryza(5.9, 6)
                }),
                new Gatve(11, "Vytauto pr.", new Sankryza[]{
                        new Sankryza(0.0, 5),
                        new Sankryza(0.5, 4),
                        new Sankryza(0.75, 4),
                        new Sankryza(1.2, 4),
                        new Sankryza(3.4, 6)
                }),
                new Gatve(12, "Maironio g.", new Sankryza[]{
                        new Sankryza(0.0, 2),
                        new Sankryza(0.3, 2),
                        new Sankryza(1.1, 2),
                        new Sankryza(1.8, 2)
                }),
        };
        for (int i = 0; i < gatves.length; i++) {
            System.out.print(gatves[i].kodas + " " + gatves[i].pavadinimas + ", sankryzos:");
            for (int k = 0; k < gatves[i].sankryzos.length; k++) {
                System.out.print(gatves[i].sankryzos[k].km + " (" + gatves[i].sankryzos[k].plotis + "), ");
            }
            System.out.println();
        }
        System.out.println("***");
//        panaudojam zemiau aprasyta funkcija:
        for (int i = 0; i <gatves.length; i++){
            System.out.println(gatveToString(gatves[i]));
        }
    }
//


    //    Funkcija (metodas) , kuri visą info apie gatve grazina kaip tekstine eilute:
    static String gatveToString(Gatve gatve) {
        String rezultatas = gatve.kodas + " " + gatve.pavadinimas + " sankryzos: " ;
        for (int k = 0; k < gatve.sankryzos.length; k++) {
            rezultatas = rezultatas + gatve.sankryzos[k].km + " (" +
                    gatve.sankryzos[k].plotis + "), ";
        }

        return rezultatas;
    }
}
