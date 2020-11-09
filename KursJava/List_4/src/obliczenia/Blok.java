package obliczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blok extends Instrukcja {
    public List<Instrukcja> wnetrze;

    public Blok(Instrukcja... inst) {
        List<Instrukcja> ins = Arrays.asList(inst);
        wnetrze  = new ArrayList<>();
        for (Instrukcja i: ins) {
//            if(i == null)
//                throw new IllegalArgumentException("Zły argument (Null).");
            wnetrze.add(i);
        }
    }
    @Override
    public void wykonaj() {
        for (Instrukcja i: wnetrze) {
            i.wykonaj();
        }
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
