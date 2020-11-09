package obliczenia;

public class Przypisanie extends Instrukcja {
    private Wyrazenie o;
    private String  zm;

    public Przypisanie(String nazwaZm, Wyrazenie obliczalny){
//        if(o == null || zm == null)
//            throw new IllegalArgumentException("Zły argument");
        this.o = obliczalny;
        this.zm = nazwaZm;
    }

    @Override
    public void wykonaj() {
        Zmienna.wartosci.replace(zm, o.oblicz());
    }

    @Override
    public String toString() {
        return zm + " = " + o.toString() + ";\n";
    }
}
