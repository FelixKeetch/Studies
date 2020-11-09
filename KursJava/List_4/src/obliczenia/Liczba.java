package obliczenia;

public class Liczba extends Wyrazenie {
    public int wartosc;

    public Liczba(int wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public int oblicz() {
        return wartosc;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Liczba)
            return this.wartosc == ((Liczba) obj).wartosc;
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(wartosc);
    }
}
