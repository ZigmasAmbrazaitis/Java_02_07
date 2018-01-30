package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.6.​ Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
        // paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        // KMI = masė (kg) / (ūgis(m))^2
        // 1.7.​ Realizuoti 1.6.​ užduotį panaudojant metodą, kurio parametrai būtų masė ir svoris, o
        // grąžinama reikšmė, kūno masės indeksas.
        parametrai();
        System.out.println("Jusu KMI yra: " + KMI(mase, ugis));
    }

    private static float mase;
    private static float ugis;

    private static void parametrai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo svori(kg): ");
        mase = sc.nextFloat();
        System.out.println("Iveskite savo ugi(metrais): ");
        ugis = sc.nextFloat();
    }

    private static float KMI(float a, float b) {
        return a / (b * b);
    }
}
