package com.company;

public class  Odcinek {
    private Punkt A;
    private Punkt B;

    public Odcinek(Punkt A, Punkt B){
        if(A.getX() == B.getX()
        && A.getY() == B.getY())
            throw new IllegalArgumentException("Podane punkty nie odpowiadają wymaganiom");
        this.A = A;
        this.B = B;
    }
    public void przesun(Wektor w){
        A.przesun(w);
        B.przesun(w);
    }
    public void obroc(Punkt p, double kat){
        A.obroc(p, kat);
        B.obroc(p, kat);
    }
    public void odbij(Prosta p){
        A.odbij(p);
        B.odbij(p);
    }
}
