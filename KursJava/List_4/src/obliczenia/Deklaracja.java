package obliczenia;

public class Deklaracja extends Instrukcja {
    private String zm;
    public Deklaracja(String nazwaZm){
//        if(nazwaZm == null)
//            throw new IllegalArgumentException("Zły argument");
        this.zm = nazwaZm;
    }
    @Override
    public void wykonaj() {
        Zmienna.wartosci.put(zm, 0);
    }

    @Override
    public String toString() {
        return "var " + zm + ";\n";
    }
}
