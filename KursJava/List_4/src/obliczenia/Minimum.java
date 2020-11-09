package obliczenia;

public class Minimum extends Operator2Arg{
    public Minimum(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "min";
    }

    @Override
    public int oblicz() {
        int ww = w.oblicz();
        int w2w = w2.oblicz();
        return (ww > w2w)? w2w : ww;
    }

    @Override
    public String toString() {
        return "min(" + w.toString() + ", "
                + w2.toString() + ")";
    }
}
