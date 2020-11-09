package obliczenia;

public class MniejszeRowne extends Operator2Arg {
    public MniejszeRowne(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "<=";
    }

    @Override
    public int oblicz() {
        return (w.oblicz() <= w2.oblicz())? 1 : 0;
    }
}
