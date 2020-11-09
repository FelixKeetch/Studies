package obliczenia;

public class Modulo extends Operator2Arg {
    public Modulo(Wyrazenie w, Wyrazenie w2){
        super(w, w2);
        this.znak = "%";
    }
    @Override
    public int oblicz() {
        int w2w = w2.oblicz();
        if(w2w == 0)
            throw new IllegalArgumentException("Modulo zero : undefined.");
        return  w.oblicz() % w2w;
    }
}
