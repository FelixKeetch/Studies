package obliczenia;

public class JezeliIInaczej extends Jezeli {

    private Wykonywalny f;

    public JezeliIInaczej(Wyrazenie o, Wykonywalny t, Wykonywalny f) {
        super(o, t);
        if(f == null)
            throw new IllegalArgumentException("Zły argument");
        this.f = f;
    }

    @Override
    public void wykonaj() {
        if(o.oblicz() != 0)
            t.wykonaj();
        else
            f.wykonaj();
    }

    @Override
    public String toString() {
        return "if " + o.toString() + " " + t.toString() + "\n else"
                + f.toString();
    }
}
