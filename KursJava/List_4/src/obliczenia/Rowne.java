package obliczenia;

public class Rowne extends Operator2Arg {
    public Rowne(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "==";
    }

    @Override
    public int oblicz() {
        return (w.oblicz() == w2.oblicz())? 1 : 0;
    }

}
