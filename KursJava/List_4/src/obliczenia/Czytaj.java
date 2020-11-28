package obliczenia;

import java.util.Scanner;

public class Czytaj extends Instrukcja {
    private String zm;

    public Czytaj(String zm){
        if(zm == null)
            throw new IllegalArgumentException("Zły argument");
        this.zm = zm;
    }

    @Override
    public void wykonaj() {
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        Zmienna.wartosci.replace(zm, input);
        sc.close();
    }

    @Override
    public String toString() {
        return "read " + zm + ";\n";
    }
}
