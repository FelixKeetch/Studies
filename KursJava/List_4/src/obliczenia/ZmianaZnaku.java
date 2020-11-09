package obliczenia;

public class ZmianaZnaku extends Operator1Arg {

    public ZmianaZnaku(Wyrazenie w){
        super(w);
        this.znak = "--";
    }
    @Override
    public int oblicz() {
        return - w.oblicz();
    }

    @Override
    public String toString() {
        return  "-" + w.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
