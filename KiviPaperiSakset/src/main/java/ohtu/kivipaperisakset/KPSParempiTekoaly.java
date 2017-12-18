package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends Peli {

    private TekoalyParannettu tekoaly;
    
    public KPSParempiTekoaly(Tuomari tuomari, Scanner lukija) {
        super(tuomari, lukija);
        this.tekoaly = new TekoalyParannettu(20);
    }

    @Override
    public String haeEkaSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekan = lukija.nextLine();
        System.out.println(ekan);
        return ekan;
    }

    @Override
    public String haeTokaSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

}
