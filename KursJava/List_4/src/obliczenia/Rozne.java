package obliczenia;

public class Rozne extends Operator2Arg {
    public Rozne(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "!=";
    }

    @Override
    public int oblicz() {
        return (w.oblicz() == w2.oblicz())? 0 : 1;
    }

}
