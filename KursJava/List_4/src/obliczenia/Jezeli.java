package obliczenia;

public class Jezeli extends Instrukcja {
    Wyrazenie o;
    Wykonywalny t;

    public Jezeli(Wyrazenie o, Wykonywalny t) {
        if(o == null || t == null)
            throw new IllegalArgumentException("Zły argument");
        this.o = o;
        this.t = t;
    }

    @Override
    public void wykonaj() {
        if(o.oblicz() != 0)
            t.wykonaj();
    }

    @Override
    public String toString() {
        return "if " + o.toString() + t.toString();
    }
}
