package obliczenia;

public class Petla extends Jezeli {

    public Petla(Wyrazenie o, Wykonywalny t) {
        super(o, t);
    }

    @Override
    public void wykonaj() {
        while(o.oblicz() != 0)
            t.wykonaj();
    }

    @Override
    public String toString() {
        return "while " + o.toString() + " " + t.toString();
    }
}
