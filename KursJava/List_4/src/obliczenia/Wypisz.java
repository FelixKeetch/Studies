package obliczenia;

public class Wypisz extends Instrukcja {
    private Wyrazenie o;
    public Wypisz(Wyrazenie o) {
//        if(o == null)
//            throw new IllegalArgumentException("Zły argument");
        this.o = o;
    }

    @Override
    public void wykonaj() {
        System.out.println(o.oblicz());
    }

    @Override
    public String toString() {
        return "write " + o.toString() + ";\n";
    }
}
