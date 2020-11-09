package obliczenia;

public class Dodawanie extends Operator2Arg{

    public Dodawanie(Wyrazenie w, Wyrazenie w2) {
        super(w, w2);
        this.znak = "+";

    }
    @Override
    public int oblicz() {
        return w.oblicz() + w2.oblicz();
    }


}
