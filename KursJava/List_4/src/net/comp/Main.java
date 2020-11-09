package net.comp;

import obliczenia.*;

public class Main {

    public static void main(String[] args) {
        Zmienna.wartosci.put("x", 2);
        Zmienna.wartosci.put("y", 3);
//        testOne();
//        testTwo();
//        testThree();
//        testFour();
//        testFive();
        testSix();
    }

    static void testOne(){
        Wyrazenie w = new Dodawanie(new Liczba(3), new Liczba(5));
        p(w);
    }

    static void testTwo(){
        Wyrazenie w = new Mnozenie(new ZmianaZnaku(new Odejmowanie(new Liczba(2),new Zmienna("x"))),
                new Liczba(7));
        p(w);
    }
    static void testThree(){
        Wyrazenie w = new Dzielenie(new Odejmowanie(new Mnozenie(new Liczba(3), new Liczba(11)), new Liczba (1)) ,
                new Dodawanie(new Liczba(7), new Liczba(5)));
        p(w);
    }
    static void testFour(){
        Wyrazenie w = new Minimum(new Mnozenie(new Dodawanie(new Zmienna("x"), new Liczba(13)), new Zmienna("x")), new Modulo(new Odejmowanie(new Liczba(1), new Zmienna("x")), new Liczba(2)));
        p(w);
    }
    static void testFive(){
        Wyrazenie w = new Mniejsze(new Dodawanie(new Potegowanie(new Liczba(2), new Liczba(5)), new Mnozenie(new Zmienna("x"), new LogDykretny(new Liczba(2), new Zmienna("y")))), new Liczba(20));
        p(w);
    }
    private static void testSix() {

        Zmienna p = new Zmienna("p");
        Zmienna n = new Zmienna("n");
        Zmienna wyn = new Zmienna("wyn");
        Deklaracja dn = new Deklaracja("n");
        Deklaracja dp = new Deklaracja("p");
        Deklaracja dwyn = new Deklaracja("wyn");
        Czytaj cn = new Czytaj("n");

        Przypisanie wynP = new Przypisanie("wyn", p);
        Przypisanie pn = new Przypisanie("p", new Zmienna("n"));
        Przypisanie p2 = new Przypisanie("p", new Liczba(2));

        Jezeli j = new Jezeli(new Rowne(new Modulo(n, p), new Stala(0)),
                              new Blok(wynP, pn));
        Przypisanie pPlusPlus = new Przypisanie("p",
                new Dodawanie(new Zmienna("p"), new Liczba(1)));
        Instrukcja i = new Blok(
                dn,
                cn,
                new JezeliIInaczej(new Mniejsze(new Zmienna("n"), new Liczba(2)),
                    new Wypisz(new Stala(0)),
                    new Blok(
                            dp,
                            p2,
                            dwyn,
                            new Petla(new MniejszeRowne(new Mnozenie(p,p), n),
                                      new Blok(j, pPlusPlus)),
                            new JezeliIInaczej(new Wieksze(new Zmienna("wyn"), new Stala(0)),
                                               new Wypisz(new Stala(0)),
                                               new Wypisz(new Stala(1))))));

        p(i);
    }
    static void p(Wyrazenie w){
        System.out.println(w.toString() + " = " + w.oblicz());
    }
    static void p(Instrukcja i){
        System.out.println(i.toString());
        i.wykonaj();
    }
}
