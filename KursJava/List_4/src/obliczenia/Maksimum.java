package obliczenia;

public class Maksimum extends Operator2Arg {

    public Maksimum(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "max";
    }

    @Override
    public int oblicz() {
        int ww = w.oblicz();
        int w2w = w2.oblicz();
        return (ww < w2w)? w2w : ww;
    }

    @Override
    public String toString() {
        return "max(" + w.toString() + ", "
                + w2.toString() + ")";
    }


}
