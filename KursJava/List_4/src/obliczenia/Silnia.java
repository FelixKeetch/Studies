package obliczenia;

public class Silnia extends Operator1Arg {
    public Silnia(Wyrazenie w){
        super(w);
        this.znak = "!";
    }
    @Override
    public String toString() {
        return w.toString() + "!";
    }

    @Override
    public int oblicz() {
        int i = w.oblicz();
        int wynik = 1;
        while(i > 1)
            wynik *= i--;
        return wynik;
    }
}
