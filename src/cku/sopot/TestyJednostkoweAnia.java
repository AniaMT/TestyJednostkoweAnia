package cku.sopot;

import java.util.Scanner;

public class TestyJednostkoweAnia {
    static float bokA;
    static float bokB;
    static float pole;
    static float obwod;

    public static void main(String[] args) {
        Scanner buforKlawiatury = new Scanner(System.in);
        System.out.print("Podaj bok A prostokąta: ");
        bokA = buforKlawiatury.nextFloat();
        System.out.print("Podaj bok B prostokąta: ");
        bokB = buforKlawiatury.nextFloat();

        Prostokat prostokat = new Prostokat(bokA, bokB);
        pole = prostokat.obliczPole();
        obwod = prostokat.obliczObwod();

        System.out.print("Prostokąt o boku A: " + bokA + " i boku B: " + bokB);
        System.out.println(" ma pole: " + pole + " i obwód: " + obwod +".");

    }
}
