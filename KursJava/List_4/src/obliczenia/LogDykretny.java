package obliczenia;

public class LogDykretny extends Operator2Arg {

    public LogDykretny(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak= "log";
    }

    @Override
    public int oblicz() {
        int w1 = w.oblicz();
        if(w1 < 0)
            throw new IllegalArgumentException("Podstawa mniejsza 0 : " + w1);
        return (int) (Math.log(w2.oblicz())/Math.log(w1));
    }

    @Override
    public String toString() {
        return " log(" + w.toString() + ", "
                + w2.toString() + ")";
    }
}
