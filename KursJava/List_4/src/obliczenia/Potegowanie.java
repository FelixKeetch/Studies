package obliczenia;

public class Potegowanie extends Operator2Arg {
    public Potegowanie(Wyrazenie w, Wyrazenie w2){
        super(w, w2);
        this.znak = "^";
    }
    @Override
    public int oblicz() {
        return (int)Math.pow(w.oblicz(), w2.oblicz());
    }
}
