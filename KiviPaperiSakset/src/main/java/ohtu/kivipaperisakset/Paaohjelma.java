package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            alkuohje();

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                ohje();
                Peli kaksinpeli = Peli.luoPelaajaVsPelaaja(new Tuomari(), scanner);
                kaksinpeli.pelaa();
            } else if (vastaus.endsWith("b")) {
                ohje();
                Peli yksinpeli = Peli.luoPelaajaVsTekoaly(new Tuomari(), scanner);
                yksinpeli.pelaa();
            } else if (vastaus.endsWith("c")) {
                ohje();
                Peli pahaYksinpeli = Peli.luoPelaajaVsParempiTekoaly(new Tuomari(), scanner);
                pahaYksinpeli.pelaa();
            } else {
                break;
            }

        }

    }

    private static void ohje() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }

    private static void alkuohje() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
