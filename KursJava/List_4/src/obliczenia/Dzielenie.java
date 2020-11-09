package obliczenia;

public class Dzielenie extends Operator2Arg {
    public Dzielenie(Wyrazenie w, Wyrazenie w2){
        super(w, w2);
        this.znak = "/";
    }
    @Override
    public int oblicz() {
        int w2w = w2.oblicz();
        if(w2w == 0)
            throw new IllegalArgumentException("Dzielenie przez zero");
        return  w.oblicz() / w2w;
    }
}
