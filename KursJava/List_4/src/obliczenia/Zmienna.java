package obliczenia;

import java.util.HashMap;

public class Zmienna extends Wyrazenie {

    public final static HashMap<String, Integer> wartosci = new HashMap<>();
    private final String nazwa;

    public Zmienna(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public int oblicz() {
        return wartosci.get(nazwa);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Zmienna)
            return this.nazwa.equals(((Zmienna)obj).nazwa);
        return false;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
