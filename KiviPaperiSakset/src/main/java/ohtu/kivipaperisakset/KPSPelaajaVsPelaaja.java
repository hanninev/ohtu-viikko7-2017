package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Peli {

    public KPSPelaajaVsPelaaja(Tuomari tuomari, Scanner lukija) {
        super(tuomari, lukija);
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
        System.out.print("Toisen pelaajan siirto: ");
        String tokan = lukija.nextLine();
        System.out.println(tokan);
        return tokan;
    }
}
