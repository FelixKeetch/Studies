package obliczenia;

public abstract class Wyrazenie implements Obliczalny {
    public static int suma(Wyrazenie... w){
        int s = 0;
        for (Wyrazenie k : w) {
            s += k.oblicz();
        }
        return s;
    }
    public static int iloczyn(Wyrazenie... w){
        int s = 0;
        for (Wyrazenie k : w) {
            s *= k.oblicz();
        }
        return s;
    }

    @Override
    public String toString() {
        return "#";
    }
}
