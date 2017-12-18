package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class Peli {

    private Tuomari tuomari;
    protected Scanner lukija;

    public Peli(Tuomari tuomari, Scanner lukija) {
        this.tuomari = tuomari;
        this.lukija = lukija;
    }

    public void pelaa() {
        String ekanSiirto = haeEkaSiirto();
        String tokanSiirto = haeTokaSiirto();
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println("");
        while (tarkista(ekanSiirto, tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            ekanSiirto = haeEkaSiirto();
            tokanSiirto = haeTokaSiirto();
            System.out.println(tuomari);
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public boolean tarkista(String ekanSiirto, String tokanSiirto) {
        return (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto));
    }

    public static Peli luoPelaajaVsPelaaja(Tuomari tuomari, Scanner lukija) {
        return new KPSPelaajaVsPelaaja(tuomari, lukija);
    }

    public static Peli luoPelaajaVsTekoaly(Tuomari tuomari, Scanner lukija) {
        return new KPSTekoaly(tuomari, lukija);
    }

    public static Peli luoPelaajaVsParempiTekoaly(Tuomari tuomari, Scanner lukija) {
        return new KPSParempiTekoaly(tuomari, lukija);
    }

    public abstract String haeEkaSiirto();

    public abstract String haeTokaSiirto();
}
