package obliczenia;

public class Mnozenie extends Operator2Arg {

    public Mnozenie(Wyrazenie w, Wyrazenie w2){
        super(w, w2);
        this.znak = "*";
    }
    @Override
    public int oblicz() {
        return w.oblicz() * w2.oblicz();
    }
}
