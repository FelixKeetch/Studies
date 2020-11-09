package obliczenia;

public class Odejmowanie extends Operator2Arg {

    public Odejmowanie(Wyrazenie w, Wyrazenie w2) {
        super(w,w2);
        this.znak = "-";
    }

    @Override
    public int oblicz() {
        return w.oblicz() - w2.oblicz();
    }
}
