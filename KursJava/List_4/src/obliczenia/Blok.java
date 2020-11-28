package obliczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blok extends Instrukcja {

    public List<Instrukcja> wnetrze;
    public ArrayList<String> vars;

    public Blok(Instrukcja... inst) {
        List<Instrukcja> ins = Arrays.asList(inst);
        wnetrze  = new ArrayList<>();
        vars  = new ArrayList<>();

        for (Instrukcja i: ins) {
            if(i == null)
                throw new IllegalArgumentException("Zły argument (Null).");
            if(i instanceof Deklaracja){
                String s = ((Deklaracja) i).getZm();
                if(Zmienna.wartosci.containsKey(s)){
                    throw new IllegalArgumentException("Podwojna deklaracja zmiennej : " + s);
                }
                vars.add(s);
            }
            wnetrze.add(i);
        }
    }
    @Override
    public void wykonaj() {
        for (Instrukcja i: wnetrze) {
            i.wykonaj();
        }
        if(!vars.isEmpty())
            System.out.print("Usunięto zmienne: ");
        for (String s : vars){
            Zmienna.wartosci.remove(s);
            System.out.print(s + " ");
        }
        if(!vars.isEmpty())
            System.out.println("");
    }

    @Override
    public String toString() {
        String s = "{\n";
        for (Instrukcja i: wnetrze)
            s = s + i.toString();
        s = s + "}";
        return s;
    }
}
