package obliczenia;

public class Deklaracja extends Instrukcja {
    private String zm;
    public Deklaracja(String nazwaZm){
        if(nazwaZm == null)
            throw new IllegalArgumentException("Zły argument");
        this.zm = nazwaZm;
        Zmienna.wartosci.put(zm, 0);
    }
    @Override
    public void wykonaj() {}

    @Override
    public String toString() {
        return "var " + zm + ";\n";
    }

    public String getZm() {
        return zm;
    }
}
