package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli {
    
    private Tekoaly tekoaly;
    
    public KPSTekoaly(Tuomari tuomari, Scanner lukija) {
        super(tuomari, lukija);
        this.tekoaly = new Tekoaly();
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
