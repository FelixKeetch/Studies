package obliczenia;

public abstract class Operator2Arg extends Operator1Arg {

    protected String znak;
    protected Wyrazenie w2;
    public Operator2Arg(Wyrazenie w, Wyrazenie w2){
        super(w);
        this.w2 = w2;
    }
    @Override
    public String toString() {
        return "(" + w.toString() + " " + znak + " " +
                w2.toString() + ")";
    }
}
