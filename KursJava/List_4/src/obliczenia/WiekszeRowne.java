package obliczenia;

public class WiekszeRowne extends Operator2Arg {

    public WiekszeRowne(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = ">=";
    }
    @Override
    public int oblicz() {
        return (w.oblicz() >= w2.oblicz())? 1 : 0;
    }
}
